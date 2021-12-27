package com.marlabs.training;

public class BikerRace {
	static int rank = 1;

	synchronized static void body() {
		try {
			System.out.println(
					Thread.currentThread().getName() + " " + " reached the finishing point rank: " + " " + rank);
			rank++;
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Runnable r1 = () -> {
			body();
		};
		Thread t1 = new Thread(r1, "Shubham");
		Thread t2 = new Thread(r1, "Deepak");
		Thread t3 = new Thread(r1, "Madhu");
		System.out.println("Race started");
		t3.start();
		t1.start();
		t2.start();
	}
}
