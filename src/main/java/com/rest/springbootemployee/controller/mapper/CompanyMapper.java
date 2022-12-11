package com.rest.springbootemployee.controller.mapper;

import com.rest.springbootemployee.controller.CompanyRequest;
import com.rest.springbootemployee.controller.CompanyResponse;
import com.rest.springbootemployee.entity.Company;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class CompanyMapper {
    public static Company toEntity(CompanyRequest companyRequest){
    Company company = new Company();
    //employee.setName(employeeRequest.getName());
    //employee.setAge(employeeRequest.getAge());
    //employee.setGender(employeeRequest.getGender());
    //employee.setSalary(employeeRequest.getSalary());
        BeanUtils.copyProperties(companyRequest,company );

        return company;
}

    public CompanyResponse toResponse(Company company){
        CompanyResponse companyResponse = new CompanyResponse();
        companyResponse.setId(company.getId());
        companyResponse.setName(company.getName());
        companyResponse.setEmployeesCount(company.getEmployees() == null? 0: (int) company.getEmployees().stream().count());
        return companyResponse;

    }
}
