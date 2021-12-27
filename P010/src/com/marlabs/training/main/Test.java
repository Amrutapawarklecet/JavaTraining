package com.marlabs.training.main;

import com.marlabs.training.constructor.Employee;
import com.marlabs.training.student.Student;

public class Test {
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setEmpno(101);
		emp.setName("amruta");
		emp.setDesignation("Software Engineer");
		emp.setSalary(30000.45f);
		System.out.println(emp.getEmpno());
		System.out.println(emp.getName());
		System.out.println(emp.getDesignation());
		System.out.println(emp.getSalary());

		Student s = new Student();
		s.setRollno(102);
		s.setName("afreen");
		s.setEmail("afreen@gmail.com");
		System.out.println(s.getRollno());
		System.out.println(s.getName());
		System.out.println(s.getEmail());

	}
}
