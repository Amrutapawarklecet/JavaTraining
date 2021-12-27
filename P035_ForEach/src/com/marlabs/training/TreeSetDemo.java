//TreeSet ->Display the data in sorted order
package com.marlabs.training;

import java.util.*;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<Integer>();
		System.out.println(ts.isEmpty());// return boolean value
		System.out.println(ts.size());
		ts.add(70);
		ts.add(20);
		ts.add(30);
		ts.add(10);
		ts.add(50);
		ts.add(50);
		ts.add(60);
		// forEach loop
		System.out.println("*************");
		for (Object obj : ts)
			System.out.println(obj);
		System.out.println("*************");

	}
}
