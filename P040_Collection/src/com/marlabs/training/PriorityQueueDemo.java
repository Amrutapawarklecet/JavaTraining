package com.marlabs.training;

import java.util.*;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		PriorityQueue<String> queue=new PriorityQueue<String>(); 
		queue.add("Subham");
		queue.add("Sunil");
		queue.add("Geetanjali");
		queue.add("Ajay");//FIFO
		System.out.println(queue.element());//display head element
		System.out.println(queue.peek());//display head element
		System.out.println(queue.remove());//remove head element
		System.out.println(queue.poll());//remove head element
		System.out.println("************************************************");

		Iterator itr=queue.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		queue.add("sandip");
		queue.add("trupti");
		System.out.println("************************************************");
		Iterator itr1=queue.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		System.out.println("Head elememt is"+queue.element());//display the head element
		
	}

}
