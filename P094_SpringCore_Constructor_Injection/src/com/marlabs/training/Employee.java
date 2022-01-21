package com.marlabs.training;

public class Employee {
	private String empid, name, salary, designation;
	private Bank bank;

	public Employee(String empid, String name, String salary, String designation, Bank bank) {
		super();
		this.empid = empid;
		this.name = name;
		this.salary = salary;
		this.designation = designation;
		this.bank = bank;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", salary=" + salary + ", designation=" + designation
				+ ", bank=" + bank + "]";
	}

}
