package com.marlabs.training.arrays;

import java.util.Scanner;

public class Salary extends Department{
	float salary,Hra,Itax;
	void input() {
		super.input();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter salary,Hra,Itax");
		salary = sc.nextFloat();
		Hra = sc.nextFloat();
		Itax = sc.nextFloat();
		
	}
	void display() {
		super.display();
		System.out.println("The Salary is:" + salary);
		System.out.println("The HRA is:" + Hra);
		System.out.println("The Itax is:" + Itax);
	}
	
	public static void main(String[] args) {
		Salary s=new Salary();
		s.input();
		s.display();
	}

}
