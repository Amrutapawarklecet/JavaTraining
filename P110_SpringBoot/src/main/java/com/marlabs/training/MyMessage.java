
package com.marlabs.training;

import org.springframework.stereotype.Component;
//crtl+shift+O

@Component("msg")
public class MyMessage {

	public void welcome() {
		System.out.println("Welcome to springboot");
	}

	public int sum(int a, int b) {
		return a + b;
	}

	public int sub(int a, int b) {
		return a - b;
	}

	public int mul(int a, int b) {
		return a * b;
	}

	public int div(int a, int b) {
		return a / b;
	}

}
