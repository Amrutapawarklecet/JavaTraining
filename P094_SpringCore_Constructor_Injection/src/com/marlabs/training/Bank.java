package com.marlabs.training;

public class Bank {
	
	String accno,balance,bankname;

	public Bank(String accno, String balance, String bankname) {
		super();
		this.accno = accno;
		this.balance = balance;
		this.bankname = bankname;
	}

	@Override
	public String toString() {
		return "Bank [accno=" + accno + ", balance=" + balance + ", bankname=" + bankname + "]";
	}
	
	
}
