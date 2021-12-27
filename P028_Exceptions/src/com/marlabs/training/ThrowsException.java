package com.marlabs.training;

public class ThrowsException {

	public static void main(String[] args) throws Exception {
		for(int i=1;i<=10;i++) {
			System.out.println(i);
			Thread.sleep(1000);//interrupt the flow of control
			//Thred is class belongs to lang package
			//sleep is static method
		}
	}
}
