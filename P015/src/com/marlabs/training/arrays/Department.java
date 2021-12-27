package com.marlabs.training.arrays;

import java.util.Scanner;

public class Department extends Employee {

	String loc,designation,dept;

	void input() {
		super.input();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter loc,designation,dept");
		loc = sc.nextLine();
		designation = sc.nextLine();
		dept = sc.nextLine();
	}
	void display() {
		super.display();
		System.out.println("The Location is:" + loc);
		System.out.println("The Designation is:" + designation);
		System.out.println("The Department is:" + dept);
	}

}