package com.rest.springbootemployee.controller.mapper;

import com.rest.springbootemployee.controller.EmployeeRequest;
import com.rest.springbootemployee.controller.EmployeeResponse;
import com.rest.springbootemployee.entity.Employee;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;
@Component
public class EmployeeMapper {

public Employee toEntity(EmployeeRequest employeeRequest){

        Employee employee = new Employee();
        //employee.setName(employeeRequest.getName());
        //employee.setAge(employeeRequest.getAge());
        //employee.setGender(employeeRequest.getGender());
        //employee.setSalary(employeeRequest.getSalary());
        BeanUtils.copyProperties(employeeRequest, employee);

        return employee;
    }

    public EmployeeResponse toResponse(Employee employee){
        EmployeeResponse employeeResponse = new EmployeeResponse();
        BeanUtils.copyProperties(employee, employeeResponse);

        return employeeResponse;

    }
}
