package com.rest.springbootemployee.exception.repository;

import com.rest.springbootemployee.entity.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeMongoRepository extends MongoRepository<Employee, String> {


    Object findByGender(String gender);
}
