package com.marlabs.training;

public class Thread1  extends Thread{

	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("Thread1"+" "+i);
			try {
				Thread.sleep(1000);//interrupts the flow of control
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
