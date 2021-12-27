package com.marlabs.training.arrays;

import java.util.Scanner;

public class Marks extends Student {

	int phy, chem, math, total, avg;
	String grade;

	void input() {
		super.input();// access method and variables from parent class
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter phy,chem,math marks");
		phy = sc.nextInt();
		chem = sc.nextInt();
		math = sc.nextInt();
		total = phy + chem + math;
		avg = total / 3;
		if (avg >= 70) {
			grade = "First Grade";
		}
		if (avg >=60) {
			grade = "Second Grade";
		}

		if (avg >= 50) {
			grade = "Thrid Grade";
		} else
			grade = "Fail";

	}

	void display() {
		System.out.println("The total is:" + total);
		System.out.println("The avg is:" + avg);
		System.out.println("The grade is:" + grade);
	}

	public static void main(String[] args) {
		Marks m = new Marks();
		m.input();
		m.display();
	}
}
