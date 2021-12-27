package com.marlabs.training;

import java.util.*;

public class HashMapDemo {

	public static void main(String[] args) {

		HashMap<Integer, String> hm=new HashMap<Integer, String>();
		hm.put(1, "Gitanjali");
		hm.put(2, "Subham");
		hm.put(3, "Sandip");
		hm.put(4, "sunil");
		hm.put(4, "ajay");
		hm.put(5, "sunil");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter rollno");
		int rollno=sc.nextInt();
		System.out.println("Enter name");
		String name=sc.next();
		hm.put(rollno, name);
		System.out.println(hm);
	}

}
