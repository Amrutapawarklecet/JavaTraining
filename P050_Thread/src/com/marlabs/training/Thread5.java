package com.marlabs.training;

public class Thread5 implements Runnable {
	@Override
	public void run() {

		for (int i = 1; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName() + " " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		Thread5 ob = new Thread5();
		Thread obj1 = new Thread(ob, "Shubham");
		Thread obj2 = new Thread(ob, "Madhu");
		Thread obj3 = new Thread(ob, "Shilpa");
		obj1.start();
		obj2.start();
		obj3.start();
	}
}
