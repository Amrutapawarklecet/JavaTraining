//create a class employee and constructor pass values(empid,name,salary) and display it

package com.marlabs.training;

import java.util.*;

import org.springframework.stereotype.Component;

@Component("emp")
public class Employee {

	private int empid, salary;
	private String name;

	public Employee() {
		super();
		this.empid = empid;
		this.salary = salary;
		this.name = name;
	}

	public void intput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter empid,name,salary");
		empid = sc.nextInt();
		name = sc.next();
		salary = sc.nextInt();
	}

	public void display() {
		System.out.println("Employee id is:" + empid);
		System.out.println("Employee name is:" + name);
		System.out.println("Employee salary is:" + salary);

	}

}
