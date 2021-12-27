//Final
package com.marlabs.training;

public class Demo {

	// Variable
	final int a = 10;

	// method
	final void display() {
		System.out.println("Final Dislay");
	}

	public static void main(String[] args) {
		Demo d = new Demo();
		d.display();
		System.out.println("The value of a is:" + d.a);
	}

}