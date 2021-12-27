package com.marlabs.training.object;

import java.util.*;

public class Student {
	int rollno;
	String name;
	float physics, chemistry, maths, total;

	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter rollno,name,physics,chemistry,maths");
		rollno = sc.nextInt();
		name = sc.next();
		physics = sc.nextFloat();
		chemistry = sc.nextFloat();
		maths = sc.nextFloat();
		total = physics + chemistry + maths;
	}

	void output() {
		System.out.println("The student rollno is:" + rollno);
		System.out.println("The student name is:" + name);
		System.out.println("The student physics marks is:" + physics);
		System.out.println("The student chemistry marks is:" + chemistry);
		System.out.println("The student maths marks is:" + maths);
		System.out.println("The student total marks is:" + total);

	}

	public static void main(String[] args) {
		Student s = new Student();
		s.input();
		s.output();
	}
}
