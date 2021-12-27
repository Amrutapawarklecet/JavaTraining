//AbstractMap it is the super class of HashMap .we cann't intanceate the AbstractMap so we have to create object of the HashMap.

package com.marlabs.training;

import java.util.*;

public class AbstractMapDemo {
	public static void main(String[] args) {
		AbstractMap<String, String> d = new HashMap<String, String>();// AbstractMap is the abstact parent class.
		d.put("1", "sandip");
		d.put("2", "shubham");
		d.put("3", "sunil");
		d.put("4", "ajay");
		for (Map.Entry ab : d.entrySet()) {
			System.out.println(ab.getKey() + "    " + ab.getValue());
		}
	}
}