package com.marlabs.training;

import java.util.Enumeration;
import java.util.concurrent.ConcurrentHashMap;
import java.util.*;

public class ConcurrentHashMapDemo2 {
	public static void main(String[] args) {
		ConcurrentHashMap<String, Integer> chm = new ConcurrentHashMap<String, Integer>();
		chm.put("sandip", 100);
		chm.put("sunil", 40);
		chm.put("sandy", 60);
		chm.put("sumeet", 50);
		chm.put("shubham", 70);
		System.out.println(chm);

		System.out.println(chm.containsValue(100));
		System.out.println(chm.computeIfAbsent("Madhu", k -> 30 + 40));// adds the record to the map
		System.out.println(chm.computeIfAbsent("Mohan", k -> 60 + 40));
		System.out.println(chm.mappingCount());
		System.out.println(chm);
		Set set = chm.entrySet();
		System.out.println(set);
		Enumeration en = chm.elements();
		while (en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}
	}

}
