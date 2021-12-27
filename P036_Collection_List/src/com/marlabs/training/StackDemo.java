package com.marlabs.training;

import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		Stack<Integer> s = new Stack<Integer>();
		s.push(10); // add the data
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		s.push(60);
		for (Object obj : s)
			System.out.println(obj);
		System.out.println("**************");
		System.out.println(s.pop()); // delete the last data
		System.out.println(s.peek());// display the last data
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println("**************");
		for (Object obj : s)
			System.out.println(obj);

		//jdk1.8
		s.forEach((n)->System.out.println(n));
		System.out.println(s.search(10));//return the position
		System.out.println(s.search(20));
		System.out.println(s.search(200));//if data is not present the it display default index as -1
		System.out.println(s.search(300));
	}

}
