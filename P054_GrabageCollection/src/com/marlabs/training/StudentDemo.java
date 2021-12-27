package com.marlabs.training;

public class StudentDemo {
	int rollno;
	String name, address;

	public void finalize() {
		System.out.println("the object is going to garbage collection");
	}

	public StudentDemo(int rollno, String name, String address) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.address = address;
	}

	@Override
	public String toString() {
		return "StudentDemo [rollno=" + rollno + ", name=" + name + ", address=" + address + "]";
	}

}
