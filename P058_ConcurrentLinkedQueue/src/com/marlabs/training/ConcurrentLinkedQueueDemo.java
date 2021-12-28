/*ConcurrentLinkedQueue:-
--------------------------------------
The data will be FIFO basis.
We can add elements to the head and tail of the Queue.*/
package com.marlabs.training;

import java.util.concurrent.ConcurrentLinkedQueue;

public class ConcurrentLinkedQueueDemo {
	public static void main(String[] args) {
		ConcurrentLinkedQueue<Integer> clq = new ConcurrentLinkedQueue<Integer>();
		for (int i = 1; i <= 10; i++)
			clq.add(i);
		clq.offer(11); // add element to the tail
		clq.offer(12);
		System.out.println(clq);
		if (clq.contains(4)) // checks if present or not
		{
			System.out.println("the queue contains 4");
		} else {
			System.out.println("the queue donot contains 4");

		}
		clq.remove(5); // removes particular element from the queue
		System.out.println(clq);
		clq.removeAll(clq); // removes all the elements from the queue.
		System.out.println(clq);

	}
}
