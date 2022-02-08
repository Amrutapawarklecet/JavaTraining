package com.marlabs.training.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.marlabs.training.Employee;

@Controller
public class EmployeeController {

	@RequestMapping("/show")
	public String showData(Model model)
	{

		/*	List<Employee> list=List.of(
			new Employee(101,"sandip",45000.00),
			new Employee(102,"sunil",45000.00),
			new Employee(103,"sumit",45000.00),
			new Employee(104,"shubham",45000.00)
						);
        */
		List<Employee> list=new ArrayList<Employee>();
		list.add(new Employee(101,"sandip",45000.00));
		list.add(new Employee(102,"sunil",45000.00));
		list.add(new Employee(103,"sumit",45000.00));
		list.add(new Employee(104,"shubham",45000.00));

		model.addAttribute("emps",list);
		return "Data";
	}
}