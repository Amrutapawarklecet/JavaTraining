package com.marlabs.training;

import java.util.Scanner;

public class ArrayOutOfBoundException {

	public static void main(String[] args) {
		try {
			int a[]=new int[5];
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter 5 no:");
			for(int i=0;i<5;i++) {
				a[i]=sc.nextInt();
			}
			System.out.println("5 no are:");
			for(int i=0;i<=5;i++) {
				System.out.println(a[i]);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
