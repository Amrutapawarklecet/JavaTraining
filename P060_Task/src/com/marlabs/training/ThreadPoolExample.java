package com.marlabs.training;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Tasks implements Runnable {
	String taskName;

	public Tasks(String taskName) {
		this.taskName = taskName;
	}

	@Override
	public void run() {
		try {
			for (int j = 0; j < 5; j++) {
				if (j == 0) {
					Date dt = new Date();
					SimpleDateFormat sdf = new SimpleDateFormat("hh : mm : ss");
					System.out.println("The start time of :" + taskName + "  " + sdf.format(dt));
				} else {
					Date dt = new Date();
					SimpleDateFormat sdf = new SimpleDateFormat("hh : mm : ss");
					System.out.println("The execution time of :" + taskName + "  " + sdf.format(dt));
				}
				Thread.sleep(1000);
			}
			System.out.println(taskName + " is Completed");
		} catch (Exception ae) {
			ae.printStackTrace();
		}
	}
}

public class ThreadPoolExample {
	public static void main(String[] args) {
		Tasks rb1 = new Tasks("task 1");
		Tasks rb2 = new Tasks("task 2");
		Tasks rb3 = new Tasks("task 3");
		Tasks rb4 = new Tasks("task 4");
		Tasks rb5 = new Tasks("task 5");
		ExecutorService pl = Executors.newFixedThreadPool(5);
		pl.execute(rb1);
		pl.execute(rb2);
		pl.execute(rb3);
		pl.execute(rb4);
		pl.execute(rb5);
		pl.shutdown();

	}
}
/*
 * Output: The start time of :task 2 04 : 32 : 59
 * 
 * The start time of :task 5 04 : 32 : 59 The start time of :task 4 04 : 32 : 59
 * The start time of :task 1 04 : 32 : 59 The start time of :task 3 04 : 32 : 59
 * The execution time of :task 5 04 : 33 : 00 The execution time of :task 2 04 :
 * 33 : 00 The execution time of :task 4 04 : 33 : 00 The execution time of
 * :task 1 04 : 33 : 00 The execution time of :task 3 04 : 33 : 00 The execution
 * time of :task 5 04 : 33 : 01 The execution time of :task 2 04 : 33 : 01 The
 * execution time of :task 4 04 : 33 : 01 The execution time of :task 1 04 : 33
 * : 01 The execution time of :task 3 04 : 33 : 01 The execution time of :task 5
 * 04 : 33 : 02 The execution time of :task 2 04 : 33 : 02 The execution time of
 * :task 1 04 : 33 : 02 The execution time of :task 4 04 : 33 : 02 The execution
 * time of :task 3 04 : 33 : 02 The execution time of :task 5 04 : 33 : 03 The
 * execution time of :task 2 04 : 33 : 03 The execution time of :task 1 04 : 33
 * : 03 The execution time of :task 4 04 : 33 : 03 The execution time of :task 3
 * 04 : 33 : 03 task 1 is Completed task 5 is Completed task 2 is Completed task
 * 4 is Completed task 3 is Completed
 * -------------------------------------------------------------------------
 */