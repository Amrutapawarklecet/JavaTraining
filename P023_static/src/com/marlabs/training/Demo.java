//Static
package com.marlabs.training;

public class Demo{
	//static variables
	static int rollno=10;
	//non static variables-we cannot access inside static method
	 //int rollno=10;
	static String name="amruta";
	static String address="Bangalore";
	static int i=0;
	
	//static method
	static void display() {
		System.out.println(rollno+" "+name+" "+address);
	
	}
	static void counter() {
		i++;
		System.out.println(i);
	}
	
	//static block
	static {
		System.out.println("Static Block");
	}
	
	public static void main(String[] args) {
		System.out.println("Rollno is "+rollno);
		System.out.println("Name is "+Demo.name);
		System.out.println("Address is "+address);
		Demo.display();
		display();
		counter();
		counter();
		counter();
		counter();
	}
}