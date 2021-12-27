package com.marlabs.training;

import java.util.*;

public class ArrayQueue {

	public static void main(String[] args) {
		ArrayDeque<String> obj=new ArrayDeque<String>();
		obj.add("sunil");
		obj.add("Subham");
		obj.add("Sandip");
		obj.add("Geetanjali");
		obj.add("Ajay");
		obj.addFirst("afreen");
		obj.addLast("trupti");
		System.out.println(obj.getFirst());
		System.out.println(obj.getLast());
		System.out.println("*********************************");
		for(String s:obj) {
			System.out.println(s);
		}
	}

}
