//sort
package com.marlabs.training;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListSortDemo {

	public static void main(String[] args) {
		LinkedList<String> ls = new LinkedList<String>();
		ls.add("Trupti");
		ls.add("Shubham");
		ls.add("Madhu");
		ls.add("Geetanjali");
		ls.add("Sunil");
		ls.add("Deepak");
		Collections.sort(ls);
		ls.forEach((x) -> System.out.println(x));
	
	}

}
