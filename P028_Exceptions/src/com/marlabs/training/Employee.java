package com.marlabs.training;

import java.util.Scanner;
/*
 
1)empno it should only contain number.

2)name

3)age it should be greater than 20 years to do this job.

4)qualification should be Btech.

if all the critaria are ok then he/she is eligible to do the job

*/

public class Employee {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Enter the empno");
			int empno = sc.nextInt();
		} catch (Exception e) {
			System.out.println("Please enter only number");
		} 
		finally {
			System.out.println("Enter the name,age and qualification");
			String name = sc.next();
			int age = sc.nextInt();
			String qualification = sc.next();

			if (age > 20 && qualification.equalsIgnoreCase("Btech")) {

				System.out.println(name + " your are eligible for this job");
			} else
				throw new Exception("Age should be grather than 20 years and qualification must be btech");

		}
	}
}
