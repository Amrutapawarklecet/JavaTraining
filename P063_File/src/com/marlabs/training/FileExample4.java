package com.marlabs.training;

import java.io.*;

public class FileExample4 {
	public static void main(String[] args) throws NumberFormatException, IOException {// reading will be in character
																						// format only.(Reader/Writer)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));// like scanner intro in jdk1.5
		System.out.println("enter empno");
		int empno = Integer.parseInt(br.readLine());
		System.out.println("enter empname");
		String name = br.readLine();
		System.out.println("enter address");
		String add = br.readLine();
		System.out.println("enter salary");
		float sal = Float.parseFloat(br.readLine());
		System.out.println("the empno is :" + empno);
		System.out.println("the name is :" + name);
		System.out.println("the address is :" + add);
		System.out.println("the salary is :" + sal);

	}
}
