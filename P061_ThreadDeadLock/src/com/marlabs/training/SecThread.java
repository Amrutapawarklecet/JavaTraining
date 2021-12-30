/*Syncronized Thread :- One Thread exceute and after its execution the second thread will start execution.
------------------------------------------------------------------------------------------
DeadLock:-

public void run()
{
Syncronized Thread1 //this will first start
sleep(1000);//block state
Syncronized Thread2 //Thread 2 will be waiting for thread1 to complete its execution so that it will start excuting
}

This is the condition for DeadLock*/
package com.marlabs.training;

public class SecThread implements Runnable {
	Object ob1;
	Object ob2;

	public SecThread(Object ob1, Object ob2) {
		super();
		this.ob1 = ob1;
		this.ob2 = ob2;
	}

	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		System.out.println(name + " Putting lock on ob1");
		synchronized (ob1) {
			System.out.println(name + " Putting lock on ob1");
			work();
			System.out.println(name + " Putting lock on ob2");
			synchronized (ob2) {
				System.out.println(name + " Putting lock on ob2");
				work();
			}

			System.out.println(name + "Lock Released on ob1");
		}
		System.out.println(name + "Lock Released on ob2");
		System.out.println("Finish Excecution");
	}

	void work() {
		try {
			Thread.sleep(30000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
}
