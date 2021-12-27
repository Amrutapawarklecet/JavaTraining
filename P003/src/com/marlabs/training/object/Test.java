package com.marlabs.training.object;

import java.util.*;

public class Test {
	int empno;
	String name, address;

	void input() {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter empno,name,address");
     empno=sc.nextInt();
     name=sc.next();
     address=sc.next();
     
	}

	void output() {
		System.out.println("The emp no is:"+empno);
		System.out.println("The emp name is:"+name);
		System.out.println("The emp address is:"+address);
	}
	
	public static void main(String[] args) {
		Test t=new Test();
		t.input();
		t.output();
	}
}
