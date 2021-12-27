package com.marlabs.training;

public class StringBufferDemo {

	public static void main(String[] args) {
		
		StringBuffer s1=new StringBuffer("My name");
		System.out.println(s1.length());
		StringBuffer s2=new StringBuffer(" is amruta ");
		StringBuffer s3=new StringBuffer("I am 23 years old");
		System.out.println(s1.append(s2));
		System.out.println(s1.append(s3));
		System.out.println(s1);
		System.out.println(s1.length());
		s1.setCharAt(0, 'm');
		System.out.println(s1);
		s1.setLength(20);
		System.out.println(s1);
		s1.insert(20, "am a developer");
		System.out.println(s1);
		s1.delete(21, 24);
		System.out.println(s1);
		System.out.println(s1.reverse());
		System.out.println(s1.reverse());
		System.out.println(s1.capacity());
	}

}
