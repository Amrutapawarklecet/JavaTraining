package com.marlabs.training;
public class Employee {
	private String empid,name,salary,designation;

	
		public String getEmpid() {
		return empid;
	}



	public void setEmpid(String empid) {
		this.empid = empid;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getSalary() {
		return salary;
	}



	public void setSalary(String salary) {
		this.salary = salary;
	}



	public String getDesignation() {
		return designation;
	}



	public void setDesignation(String designation) {
		this.designation = designation;
	}



		public void display() {
		System.out.println("the empid is " + empid);
		System.out.println("the name is " + name);
		System.out.println("the salary is " + salary);
		System.out.println("the designation is " + designation);

	}

}
