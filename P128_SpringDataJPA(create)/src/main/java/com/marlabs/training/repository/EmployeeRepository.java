package com.marlabs.training.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marlabs.training.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
