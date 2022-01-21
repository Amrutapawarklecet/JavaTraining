package com.marlabs.training.beans;

public class Emp {
private String id;
private String name;
private String salary;
private String designation;

public Emp() {}

public Emp(String id, String name, String salary, String designation) {
	super();
	this.id = id;
	this.name = name;
	this.salary = salary;
	this.designation = designation;
}

public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
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

}
