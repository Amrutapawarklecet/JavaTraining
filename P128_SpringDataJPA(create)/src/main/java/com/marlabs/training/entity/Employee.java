package com.marlabs.training.entity;

import javax.persistence.*;

@Entity
@Table(name="employee3")
public class Employee {
	
   @Id
   @GeneratedValue
   @Column(name="eid")
   private int empid;
   
   @Column(name="ename")
   private String empname;
   
   @Column(name="esal")
   private float salary;

public int getEmpid() {
	return empid;
}

public void setEmpid(int empid) {
	this.empid = empid;
}

public String getEmpname() {
	return empname;
}

public void setEmpname(String empname) {
	this.empname = empname;
}

public float getSalary() {
	return salary;
}

public void setSalary(float salary) {
	this.salary = salary;
}

public Employee(int empid, String empname, float salary) {
	super();
	this.empid = empid;
	this.empname = empname;
	this.salary = salary;
}

public Employee(String empname, float salary) {
	super();
	this.empname = empname;
	this.salary = salary;
}


   
}
