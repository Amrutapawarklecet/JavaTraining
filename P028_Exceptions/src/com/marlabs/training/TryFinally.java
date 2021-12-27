//try and catch
package com.marlabs.training;

import java.util.Scanner;

public class TryFinally {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);

			System.out.println("Enter 2 numbers");
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = a / b;
			System.out.println("The result is " + c);
		} finally {
			System.out.println("The end of the program");
		}
	}
}
