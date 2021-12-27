// Single Inheritance
package com.marlabs.training.arrays;

public class Student {
	int rollno;
	String name, address;
	public Student(int rollno, String name, String address) {
		this.rollno = rollno;
		this.name = name;
		this.address = address;
	}
	void display()
	{
		System.out.println("the rollno is"+rollno+"the name is "+name+"the address is "+address);
	}

	
}
