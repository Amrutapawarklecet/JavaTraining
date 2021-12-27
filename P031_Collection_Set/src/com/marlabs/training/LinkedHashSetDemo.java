//LinkedHasSet ->Display the data in same order means how we added or displayed that same order
package com.marlabs.training;

import java.util.*;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		LinkedHashSet<Integer> ts = new LinkedHashSet<Integer>();
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
