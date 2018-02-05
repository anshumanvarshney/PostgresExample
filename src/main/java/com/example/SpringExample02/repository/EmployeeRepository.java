package com.example.SpringExample02.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.SpringExample02.entity.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, String>{
}
