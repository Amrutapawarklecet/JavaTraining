package com.marlabs.training;

public class Test {

	public static void main(String[] args) {

		String s1 = "apple";// string constant pool
		String s2 = "apple";// String constant pool
		String s3 = new String("apple");
		String s4 = new String("apple");

		if (s1 == s2) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		if (s1.equals(s2)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

		if (s1 == s3) {
			System.out.println("ture");
		} else {
			System.out.println("false");
		}

	}
}
