package com.marlabs.training;
public class Employee {
	private String empid,name,salary,designation;

	
		
		public Employee(String empid, String name, String salary, String designation) {
		super();
		this.empid = empid;
		this.name = name;
		this.salary = salary;
		this.designation = designation;
	}

  

		public Employee() {
			System.out.println("This is default constructor");
		}



		public void display() {
		System.out.println("the empid is " + empid);
		System.out.println("the name is " + name);
		System.out.println("the salary is " + salary);
		System.out.println("the designation is " + designation);

	}

}
