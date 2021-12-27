// Single Inheritance
package com.marlabs.training.arrays;

import java.util.*;

public class Employee {
	int empno;
	String name, address;

	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter empno,name,address");
		empno = sc.nextInt();
		name = sc.next();
		address = sc.next();

	}

	void display() {
		System.out.println("The Empno is:" + empno);
		System.out.println("The Name is:" + name);
		System.out.println("The Address is:" + address);

	}

}
