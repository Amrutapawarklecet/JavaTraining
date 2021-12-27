//HasSet ->Display the data in random order
package com.marlabs.training;

import java.util.*;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<Integer> ts=new HashSet<Integer>();
		ts.add(70);
		ts.add(20);
		ts.add(30);
		ts.add(10);
		ts.add(50);
		ts.add(50);
		ts.add(60);
		System.out.println(ts);

	}
}
