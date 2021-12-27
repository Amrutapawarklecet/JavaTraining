package com.marlabs.training.arrays;

import java.util.Scanner;

public class Marks extends Student {

	int phy, chem, math, total, avg;
	String grade;

	Marks(int rollno,String name, String address,int phy,int chem,int math) {
        super(rollno, name, address);
		this.phy = phy;
		this.chem = chem;
		this.math = math;
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
		super.display();
		System.out.println("The total is:" + total);
		System.out.println("The avg is:" + avg);
		System.out.println("The grade is:" + grade);
	}

	}
