package com.marlabs.training;

public class Thread7 extends Thread {
	public void run() {
		for (int i = 1; i <= 10; i++) {
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
		ob1.setPriority(MAX_PRIORITY);
		ob2.setPriority(MIN_PRIORITY);
		ob3.setPriority(NORM_PRIORITY);
		ob1.setPriority(10);
		ob2.setPriority(1);
		System.out.println(ob1.getPriority());
		System.out.println(ob2.getPriority());
		System.out.println(ob3.getPriority());

		try {
			ob1.join();// waits for this thread to die then the other thread will start executing.
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		ob3.start();

	}
}
