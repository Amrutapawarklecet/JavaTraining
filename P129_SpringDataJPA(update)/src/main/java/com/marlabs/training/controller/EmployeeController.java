package com.marlabs.training.controller;

import java.util.Arrays;
import java.util.Optional;

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
		repo.save(new Employee(1,"sandip", 3000.00f));
		repo.save(new Employee(2,"madhu", 3000.00f));
		repo.save(new Employee(3,"shubham", 3000.30f));
		repo.save(new Employee(4,"trupti", 3000.30f));
		repo.save(new Employee(4,"trupti p", 3200.30f));//update
		System.out.println(repo.count());
		
		repo.saveAll(Arrays.asList(
				new Employee(5,"Kiran",35000.89f),
				new Employee(6,"Niraj",35000.89f),
				new Employee(7,"sunil",35000.89f),
				new Employee(8,"anil",35000.89f),
				new Employee(8,"anil ",38000.89f)//update
						));
		System.out.println(repo.count());

		boolean exist=repo.existsById(8);
		System.out.println(exist);
		
		Optional<Employee> opt=repo.findById(7);
		if(opt.isPresent()) {
			Employee e=opt.get();
			System.out.println(e);
		}
		
		//delete
		//repo.deleteById(8);
		//repo.deleteAll();
		
		System.out.println("******************");
		repo.findAll().forEach(System.out::println);
		
		System.out.println("******************");
		repo.findAllById(Arrays.asList(5,6,7,8)).forEach(System.out::println);
	}

}
