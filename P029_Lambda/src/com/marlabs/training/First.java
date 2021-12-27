package com.marlabs.training;

import java.util.Scanner;

@FunctionalInterface
interface Lambda1 {
	void deposit(float amount);
}

@FunctionalInterface
interface Lambda2 {
	void withdraw(float amt1);
}

@FunctionalInterface
interface Lambda3 {
	void balance();
}

public class First {
	public static float actualBalance = 0.0f;

	public static void main(String[] args) {
		try {
			System.out.println("Press 1 for deposit, press 2 for winthdraw or 0 to view balance.");
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			if (num == 1 || num == 0 || num == 2) {
				switch (num) {
				case 1:
					try {
						System.out.println("Enter amount to be deposited.");
						float amount = sc.nextFloat();
						Lambda1 lam = (amt) -> {
							actualBalance = actualBalance + amt;
						};
						lam.deposit(amount);
						System.out.println(
								"Amount diposited is" + " " + amount + " " + " Your bankbalance now:" + actualBalance);
					} catch (Exception e) {
						System.out.println("Invalid key!");
						break;
					}
				case 2:
					try {
						System.out.println();
						System.out.println("Enter 1 to continue for withdraw or Press 0 to end the session.");
						int amt1 = sc.nextInt();
						if (amt1 == 1) {
							System.out.println("Enter withdrawal ammount.");
							float amt3 = sc.nextFloat();
							if (actualBalance >= amt3) {
								Lambda2 lamb = (amt4) -> {
									actualBalance = actualBalance - amt3;
									System.out.println("Amount winthdrown is" + " " + amt3 + " "
											+ "Your bankbalance now:" + actualBalance);
								};
								lamb.withdraw(amt3);
							} else {
								System.out.println("Invalid amount! Please deposit amount first");
								break;
							}
						} else if (amt1 == 0) {
							System.out.println("Thanks for using our service.");
						}
					} catch (Exception e) {
						System.out.println("Invalid key! ");
						break;
					}
				case 0:
					Lambda3 lambd = () -> {
						System.out.println();
						System.out.println("Current Account balance is" + " " + actualBalance);
					};
					lambd.balance();
				}
			} else {
				System.out.println("Invalid entry!");
			}
		} catch (Exception e) {
			System.out.println("Invalid entry!");
		}
	}
}
