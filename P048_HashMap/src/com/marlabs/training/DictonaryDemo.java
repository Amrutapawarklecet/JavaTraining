//Dictionary it is the super class of HashTable .we cann't intanceate the Dictionary so we have to create object of the HashTable.

package com.marlabs.training;

import java.util.*;

public class DictonaryDemo {
	public static void main(String[] args) {
		Dictionary<String, String> d = new Hashtable<String, String>();// Dictionary is It is abstract parent
		d.put("1", "sandip");
		d.put("2", "shubham");
		d.put("3", "sunil");
		d.put("4", "ajay");
		for (Enumeration i = d.elements(); i.hasMoreElements();)
			System.out.println("the value are :" + i.nextElement());
	}
}