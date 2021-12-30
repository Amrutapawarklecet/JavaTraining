/*synchronized there are 3 types
--------------------------------------
1)synchronized method :-DeadLock will be for the object.
2)synchronized block:-DeadLock will be for the object.
3)static synchronized:-There will be no object created for the class.DeadLock will be for the class.*/
package com.marlabs.training;

public class ThreadDeadlock {
	public static void main(String[] args) throws Exception {
		Object ob1 = new Object();
		Object ob2 = new Object();
		Object ob3 = new Object();

		Thread t1 = new Thread(new SecThread(ob1, ob2), "t1");
		Thread t2 = new Thread(new SecThread(ob2, ob3), "t2");
		Thread t3 = new Thread(new SecThread(ob3, ob1), "t3");
		t1.start();
		Thread.sleep(5000);
		t2.start();
		Thread.sleep(5000);
		t3.start();
		Thread.sleep(5000);
	}
}