package com.marlabs.training;
//destroy():- This will destroy the thread group and the subgroups.First we have to destroy the child group then the parent.

public class DestroyDemo extends Thread {
	DestroyDemo(String tName, ThreadGroup tg) {
		super(tg, tName);
		start();
	}

	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) throws InterruptedException {
		ThreadGroup tg = new ThreadGroup("The parent Thread");
		ThreadGroup tg1 = new ThreadGroup(tg, "The child Thread");
		DestroyDemo th1 = new DestroyDemo("The first thread", tg);
		DestroyDemo th2 = new DestroyDemo("The first thread", tg);
		th1.join(); // wait until the thread finish the execution.
		th2.join();
		tg1.destroy();
		System.out.println(tg1.getName() + " is destroyed");
		tg.destroy();
		System.out.println(tg.getName() + " is destroyed");
	}
}
