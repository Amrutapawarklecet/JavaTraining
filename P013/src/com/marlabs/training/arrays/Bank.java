package com.marlabs.training.arrays;

import java.util.*;

public class Bank {
	String accno, name,email, balance;

	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter accno,email,balance");
		accno = sc.nextLine();
		name=sc.nextLine();
		email = sc.nextLine();
		balance = sc.nextLine();

	}

	void display() {
		System.out.println("The AccountNo is:" + accno);
		System.out.println("The Name is:" + name);
		System.out.println("The Email is:" + email);
		System.out.println("The Balance is:" + balance);

	}

	public static void main(String[] args) {
		Bank[] b = new Bank[20];
		for (int i = 0; i < 20; i++) {
			System.out.println("enter the data of customer" + (i + 1));
			b[i] = new Bank();
			b[i].input();
		}

		for (int i = 0; i < 20; i++) {
			System.out.println("The data of customer:" + (i + 1));
			b[i].display();
		}

	}

}
