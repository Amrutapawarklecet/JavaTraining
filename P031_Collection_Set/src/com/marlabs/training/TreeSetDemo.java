//TreeSet ->Display the data in sorted order
package com.marlabs.training;

import java.util.*;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet<Integer> ts=new TreeSet<Integer>();
		System.out.println(ts.isEmpty());//return boolean value
		System.out.println(ts.size());
		ts.add(70);
		ts.add(20);
		ts.add(30);
		ts.add(10);
		ts.add(50);
		ts.add(50);
		ts.add(60);
		System.out.println(ts.isEmpty());//return boolean value
		System.out.println(ts.size());
		System.out.println(ts.contains(10)); //serching object and return booleann value
		System.out.println(ts.contains(100));
		System.out.println(ts.size());
		ts.remove(50); //remove the object
		System.out.println(ts);
		ts.clear();//remove all objects
		System.out.println(ts);
		System.out.println(ts.size());


	}
}
