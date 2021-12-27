package com.marlabs.training;

public class Thread4 extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName() + " " + i);
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

	public static void main(String[] args) {
		Thread4 ob1 = new Thread4();
		Thread4 ob2 = new Thread4();
		Thread4 ob3 = new Thread4();
		System.out.println(ob1.isAlive());
		ob1.start();
		System.out.println(ob1.isAlive());
		ob2.start();
		ob3.start();
	}
}
