package com.marlabs.training;

public class DestroyDemo2 extends Thread {
	DestroyDemo2(String tName, ThreadGroup tg) {
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
		tg.interrupt();
		th1.join(); // wait until the thread finish the execution.
		th2.join();

		tg1.destroy();
		System.out.println(tg1.getName() + " is destroyed");
		tg.destroy();
		System.out.println(tg.getName() + " is destroyed");
		if (tg.isDaemon() == true) {
			System.out.println("The group is removed");
		} else {
			System.out.println("The group is not removed");
		}
		if (tg1.isDestroyed() == true) {
			System.out.println("the child is Destroyed");
		} else {
			System.out.println("the child is not destroyed");
		}

	}
}
