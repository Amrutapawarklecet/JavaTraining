package com.marlabs.training.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.marlabs.training.entity.Employee;
import com.marlabs.training.service.EmployeeService;

@RestController
@RequestMapping("/Employee")
public class EmployeeController {

	@Autowired
	private EmployeeService empservice;

	@PostMapping("/")
	public void addEmployee(@RequestBody Employee emp) {
		empservice.addEmployee(emp);

	}

	@PutMapping("/{empid}")
	public void updateEmployee(@RequestBody Employee emp, @PathVariable String empid) {
		empservice.updateEmployee(emp, Integer.parseInt(empid));

	}

	@DeleteMapping("/{empid}")
	public void deleteEmployee(@PathVariable String empid) {
		empservice.deleteEmployee(Integer.parseInt(empid));

	}

	@GetMapping("/{empid}")
	public Employee getEmployeeById(@PathVariable String empid) {
		Employee employee = empservice.getEmployeeById(Integer.parseInt(empid));
		return employee;

	}

	@GetMapping("/")
	public List<Employee> getAllEmployee() {
		List<Employee> allEmployees = empservice.getAllEmployee();
		return allEmployees;

	}
}
