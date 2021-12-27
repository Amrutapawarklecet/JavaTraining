package com.marlabs.training;

public class GarbageDemo {

	public static void main(String[] args) {
		StudentDemo ob1 = new StudentDemo(101, "Madhu", "hyd");
		StudentDemo ob2 = new StudentDemo(102, "Sandip", "Bangalore");
		System.out.println(ob1);
		System.out.println(ob2);
		ob1 = null;
		ob2 = null;
		System.gc();
		System.out.println("the corrent value is " + ob1);
		System.out.println("the corrent value is " + ob2);
	}
}
