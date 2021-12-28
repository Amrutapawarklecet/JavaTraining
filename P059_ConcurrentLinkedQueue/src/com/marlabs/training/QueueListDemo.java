/*wap to enter a queue of students who appered for exam.
and list of students who qualified for the exam.
*/
package com.marlabs.training;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;

public class QueueListDemo {
	public static void main(String[] args) {
		ConcurrentLinkedQueue<String> clq = new ConcurrentLinkedQueue<String>();
		List<String> k = new ArrayList<String>();
		System.out.println("Student wrote Exam");
		clq.add("sandip");
		clq.add("sunil");
		clq.add("shubham");
		clq.add("Madhu");
		k.add("sunil");
		k.add("Madhu");
		System.out.println(clq);
		System.out.println("Student qualified");
		clq.retainAll(k);// all the elements in the queue will are present in the list will be display
		System.out.println(clq);
	}
}