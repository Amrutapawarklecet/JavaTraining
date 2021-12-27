package com.marlabs.training;

public class Bank {
	int accno,balance;
	String branch;
	Customer customer;
	
	public Bank(int accno, String branch, int balance, Customer customer) {
		super();
		this.accno = accno;
		this.branch = branch;
		this.balance = balance;
		this.customer = customer;
	}
	
	void display() {
		System.out.println("Accno :" +  accno  + "Branch :" +  branch  + "Balance :" +  balance  + "Customer :" + customer);

	}

	
	
	
}
