/*ThreadGroup:- In this we have a Parent and can have a child.
we can have a multiple ThreadGroups.
A thread is allowed to access information about its own thread group.
A thread is not allowed to access information from any other thread group.*/

package com.marlabs.training;

public class ThreadGroupDemo implements Runnable {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		ThreadGroupDemo obj = new ThreadGroupDemo();
		ThreadGroup tg = new ThreadGroup("First Parent Thread");

		ThreadGroup tg1 = new ThreadGroup("Second Parent Thread");

		ThreadGroup tgc1 = new ThreadGroup(tg, "The child Thread of First Parent Thread");

		Thread t1 = new Thread(tg, obj, "First Thread");
		t1.start();
		Thread t2 = new Thread(tg, obj, "Second Thread");
		t2.start();
		Thread t3 = new Thread(tg, obj, "Third Thread");
		t3.start();
		System.out.println("The Thread Group name :" + tg.getName());
		tg.list();// This will display the list of Threads and there priority.The default priority
					// is 5 and the max priority is 10

		Thread s1 = new Thread(tg1, obj, "First Thread");
		s1.start();
		Thread s2 = new Thread(tg1, obj, "Second Thread");
		s2.start();
		Thread s3 = new Thread(tg1, obj, "Third Thread");
		s3.start();
		System.out.println("The Thread Group name :" + tg1.getName());
		tg1.list();

		Thread v1 = new Thread("First Thread");
		v1.start();
		Thread v2 = new Thread("Second Thread");
		v2.start();
		Thread v3 = new Thread("Third Thread");
		v3.start();
		System.out.println("The Thread Group name :" + tgc1.getName());
		tgc1.list();

	}
}
