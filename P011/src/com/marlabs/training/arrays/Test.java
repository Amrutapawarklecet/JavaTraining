//Arrays
package com.marlabs.training.arrays;

import java.util.*;

public class Test{
	 public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Five Number");
		int a[]=new int[5];
		for(int i=0;i<=5;i++) 
			a[i]=sc.nextInt();
			
			System.out.println("The five number are:");
			for(int i=0;i<5;i++)
			System.out.println(a[i]);
		}
	}
 
