package com.marlabs.training;

class Counter extends Thread {
	static int ticket = 2;

	synchronized public void run() {
		if (ticket != 0) {
			System.out.println(Thread.currentThread().getName() + " " + "gets the ticket");
			ticket--;
			try {
				sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} else {
			System.out
					.println("tickets sold" + " " + "No ticket available for" + " " + Thread.currentThread().getName());
		}
	}
}

public class Ticket1 {
	public static void main(String[] args) {
		Counter c = new Counter();
		Thread t1 = new Thread(c, "Rahul");
		Thread t2 = new Thread(c, "Sandip");
		Thread t3 = new Thread(c, "salman");
		t2.start();
		t3.start();
		t1.start();
	}
}
