//try and catch
package com.marlabs.training;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);

			System.out.println("Enter 2 numbers");
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = a / b;
			System.out.println("The result is " + c);
		} catch (ArithmeticException e) {
			System.out.println("The error is " + e);
		} catch (InputMismatchException e) {
			System.out.println("The errorr is " + e);
		} catch (Exception e) {
			System.out.println("The errorr is " + e);
		}
		System.out.println("The end of the program");
	}
}
