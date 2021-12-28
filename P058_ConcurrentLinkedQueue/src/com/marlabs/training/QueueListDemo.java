package com.marlabs.training;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;

public class QueueListDemo {
	public static void main(String[] args) {
		ConcurrentLinkedQueue<Integer> clq = new ConcurrentLinkedQueue<Integer>();
		List k = new ArrayList();
		for (int i = 1; i <= 25; i++)
			clq.add(i);
		System.out.println(clq);
		for (int i = 1; i <= 10; i++) {
			int j = i * 5;
			k.add(j);
		}
		clq.retainAll(k);// all the elements in the queue will are present in the list will be display
		System.out.println(clq);
	}
}