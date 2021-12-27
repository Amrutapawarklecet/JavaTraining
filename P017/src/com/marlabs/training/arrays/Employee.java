//Has-a Relationship Inheritance
package com.marlabs.training.arrays;

public class Employee {
	int empno;
	String name, phoneno;
	Address address;

	public Employee(int empno, String name, String phoneno, Address address) {
		this.empno = empno;
		this.name = name;
		this.phoneno = phoneno;
		this.address = address;
	}

	void display() {
		System.out.println("empno :" + empno + "Name :" + name + "phone no :" + phoneno + "address :" + address);

	}
}
