// Single Inheritance
package com.marlabs.training.arrays;

import java.util.*;

public class Student {
	int rollno;
	String name, address;

	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rollno,name,address");
		rollno = sc.nextInt();
		name = sc.next();// Excepts the space in between
		address = sc.next();

	}

	void display() {
		System.out.println("The Rollno is:" + rollno);
		System.out.println("The Name is:" + name);
		System.out.println("The Address is:" + address);

	}

}
