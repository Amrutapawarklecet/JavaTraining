package com.marlabs.training;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListSortDemo2 {

	public static void main(String[] args) {
		LinkedList<Integer> ls = new LinkedList<Integer>();
		ls.add(10);
		ls.add(20);
		ls.add(30);
		ls.add(50);
		ls.add(40);
		Collections.sort(ls);
		ls.forEach((x) -> System.out.println(x));
		System.out.println("largest no" + Collections.max(ls));
		System.out.println("smallest no" + Collections.min(ls));

	}

}
