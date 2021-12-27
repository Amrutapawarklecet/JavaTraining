package com.marlabs.training;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolMain {
	public static void main(String[] args) {
		ExecutorService exe = Executors.newFixedThreadPool(5); // create a fixed pool
		for (int i = 1; i < 10; i++) {
			Runnable r1 = new ThreadPoolDemo(" " + i);
			exe.execute(r1); // execute all the threads
		}
		exe.shutdown(); // close all the threads
		while (!exe.isTerminated()) {
		}
		System.out.println("Finished All Thread");
	}
}