package com.marlabs.training;

public class MainThread {

	public static void main(String[] args) {
		Thread1 t1=new Thread1();
		Thread2 t2=new Thread2();
		Thread3 t3=new Thread3();
    
		t1.start();//start will call the run().At a Time all run() will start the executing concurrently.
		t2.start();
		t3.start();
	}
}
