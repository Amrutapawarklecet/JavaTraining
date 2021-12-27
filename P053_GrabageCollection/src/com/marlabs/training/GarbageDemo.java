/*Garbage Collection
-----------------------------
DaemonThread is a low priority thread which runs in the background to do garbage collection.
The garbage collection is done for unreferenced objects.
It removes unreferenced objects so that memory can be reclaimed again for use.
It destroys the unused objects.
Java is memory efficient because the unreferenced Objcet is removerd from the heap memory .
for it we use finalize().

1)The finalize() is invoked each time before the object is garbage collected.
it is used for cleanup processing.
It is define in Object class.
---------------------------------------------------------------------------------------------------------
2)gc()
this method is used to invoke the garbage collector to do the cleanup process.

It is found in the System and Runtime class.
 */
package com.marlabs.training;

public class GarbageDemo {
	public void finalize() {
		System.out.println("the object is going to garbage collection");
	}

	public static void main(String[] args) {
		GarbageDemo ob1 = new GarbageDemo();
		GarbageDemo ob2 = new GarbageDemo();

		ob1 = null;
		ob2 = null;
		System.gc();
	}
}
