package com.marlabs.training.controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.marlabs.training.entity.Employee;
import com.marlabs.training.repository.EmployeeRepository;

@Component
public class EmployeeController implements CommandLineRunner {
	@Autowired
	private EmployeeRepository repo;

	@Override
	public void run(String... args) throws Exception {
		repo.save(new Employee("sandip", 3000.00f));
		repo.save(new Employee("madhu", 3000.00f));
		repo.save(new Employee("shubham", 3000.30f));
		repo.save(new Employee("trupti", 3000.30f));
		System.out.println(repo.count());
		
		repo.saveAll(Arrays.asList(
				new Employee("Kiran",35000.89f),
				new Employee("Niraj",35000.89f),
				new Employee("sunil",35000.89f),
				new Employee("anil",35000.89f)
						));
		System.out.println(repo.count());

		
	}

}
