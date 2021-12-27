//Abstract Class

package com.marlabs.training;

abstract class Bank {

	abstract void register();

	abstract void loan();

	abstract void creditCard();

	abstract void debitCard();

}

public class Customer extends Bank {

	@Override
	void register() {

		System.out.println("Welcome to Bank");

	}

	@Override
	void loan() {
		System.out.println("Apply for Loan");

	}

	@Override
	void creditCard() {
		System.out.println("Apply for Credit Card");

	}

	@Override
	void debitCard() {
		System.out.println("Apply for Debit Card ");

	}
	public static void main(String[] args) {
		Customer c = new Customer();
		c.register();
		c.loan();
		c.creditCard();
		c.debitCard();
	}


}
