package com.marlabs.training;

public class Thread8 {
	public static void main(String[] args) {
		Runnable r1 = new Runnable() {
			public void run() {
				for (int i = 1; i <= 10; i++) {
					System.out.println(i);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		Thread t1 = new Thread(r1);
		t1.start();
		Runnable r2 = () -> {
			for (int i = 1; i <= 10; i++) {
				System.out.println("Merry Christmas");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		Thread t2 = new Thread(r2);
		t2.start();
		t1.suspend();// the method is deprecated
		// t1.resume();
	}
}
