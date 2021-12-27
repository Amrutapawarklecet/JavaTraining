//Method Overloading
package com.marlabs.training.constructor;

public class Test {
	// instance variable
	int rollno;
	String name, address;

	// default constructor
	Test() {
		System.out.println("Default Constructor");

	}

	// Parameterized constructor(we use this keyword to difference between local and
	// instance variables)
	public Test(int rollno, String name, String address) {
		this.rollno = rollno;
		this.name = name;
		this.address = address;
	}

	public void display() {
		System.out.println("Rollno is:" + rollno);
		System.out.println("Name is:" + name);
		System.out.println("Adress is:" + address);
	}
	
	public int sum(int a, int b) {
		return a+b;
	}
	public float sum(float a,float b) {
		return a+b;
	}

	public static void main(String[] args) {
		Test t = new Test();
		Test t1 = new Test(101, "amruta", "Bangalore");
		Test t2 = new Test(102, "abhilasha", "Bangalore");
		t1.display();
		t2.display();
		System.out.println(t1.sum(10,20));
		System.out.println(t1.sum(10.5f, 20.8f));

	}

}
