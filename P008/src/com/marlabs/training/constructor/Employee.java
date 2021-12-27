
package com.marlabs.training.constructor;

public class Employee {
	
	// instance variable
	int empno;
	String name, designation;
	float salary;

	// default constructor
	Employee() {
		System.out.println("Default Constructor");

	}

	// Parameterized constructor we use this keyword to difference between local and
	// instance variables
	public Employee(int empno, String name, String designation, float salary) {
		this.empno = empno;
		this.name = name;
		this.designation = designation;
		this.salary = salary;
	}

	public void display() {
		System.out.println("Empno is:" + empno);
		System.out.println("Name is:" + name);
		System.out.println("Designation is:" + designation);
		System.out.println("Salary is:" + salary);
	}

	public static void main(String[] args) {
		Employee e = new Employee();
		Employee e1 = new Employee(101, "amruta", "Associate", 25000.45f);
		e1.display();
	}

}
