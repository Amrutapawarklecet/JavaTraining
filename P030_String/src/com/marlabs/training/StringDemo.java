package com.marlabs.training;

public class StringDemo {

	public static void main(String[] args) {
		String s1 = "Marlabs Private Solution";
		String s2 = "Mphpis Private Solution";
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.indexOf('M'));// starts from 0
		System.out.println(s1.lastIndexOf('S'));
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.substring(1));
		System.out.println(s1.substring(5, 6));
		System.out.println(s1.charAt(0));// starts from 0
		System.out.println(s1.startsWith("Marlabs"));// return true or false
		System.out.println(s1.endsWith("Solution"));
		System.out.println(s1.replace("Marlabs", "Marlab"));
		System.out.println(s1.length());
		char x[]=s1.toCharArray();//convert string to char array
		int len=x.length;
		System.out.println("The length of array:"+len);
		for (int i=0;i<len;i++) {
			System.out.println(x[i]);
		}
		System.out.println(s1);
	}

}
