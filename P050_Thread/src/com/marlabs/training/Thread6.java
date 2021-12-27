package com.marlabs.training;

public class Thread6 implements Runnable {
	@Override
	synchronized public void run() {
		try {
			String name = Thread.currentThread().getName();
			for (int i = 1; i <= 10; i++) {
				System.out.println(name + "  " + i);
				Thread.sleep(1000);
				if (name.equals("Shubham") && (i == 4)) {
					wait();
				}
				if (name.equals("Madhu") && (i == 4)) {
					wait();
				}
				if (name.equals("Shilpa") && (i == 6)) {
					notifyAll(); // wakeup all waiting Thread
				}

				if (name.equals("Shubham") && (i == 9)) {
					notify(); // wakeup 1 thread

				}

			}
		} catch (Exception ae) {
			ae.printStackTrace();
		}

	}

	public static void main(String[] args) {
		Thread6 ob = new Thread6();
		Thread obj1 = new Thread(ob, "Shubham");
		Thread obj2 = new Thread(ob, "Madhu");
		Thread obj3 = new Thread(ob, "Shilpa");
		obj1.start();
		obj2.start();
		obj3.start();
	}
}
