package com.marlabs.training;
public class Employee 
{
int empid;
String name,address;
float salary;
public Employee(int empid, String name, String address, float salary)
{
	super();
	this.empid = empid;
	this.name = name;
	this.address = address;
	this.salary = salary;
}
@Override
public String toString() {
return "Employee [empid=" + empid + ", name=" + name + ", address=" + address + ", salary=" + salary + "]";
}}