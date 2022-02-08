package com.marlabs.training.service;

import java.util.*;

import com.marlabs.training.entity.Employee;

public interface ImplEmployeeService {

	// post
	public void addEmployee(Employee emp);

	// update
	public void updateEmployee(Employee emp, int empid);

	// delete
	public boolean deleteEmployee(int empid);

	// get by id
	public Employee getEmployeeById(int empid);

	// get all
	public List<Employee> getAllEmployee();

}
