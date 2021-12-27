package com.marlabs.training;

import java.util.Scanner;

public class Throw {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age to cast your vote");
		int age = sc.nextInt();
		if (age >= 18) {
			System.out.println("your are eligible to cash your vote");
		} else {
			throw new Exception("The age should be greather then or equal to 18");
		}
	}

}
