//get key and get value
package com.marlabs.training;

import java.util.*;

public class HashMapDemo2 {

	public static void main(String[] args) {

		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "Gitanjali");
		hm.put(2, "Subham");
		hm.put(3, "Sandip");
		hm.put(4, "sunil");
		hm.put(4, "ajay");
		hm.put(5, "sunil");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rollno");
		int rollno = sc.nextInt();
		System.out.println("Enter name");
		String name = sc.next();
		hm.put(rollno, name);
		System.out.println(hm);
		Set set = hm.entrySet();
		Iterator itr = set.iterator();
		while (itr.hasNext()) {
			Map.Entry en = (Map.Entry) itr.next();
			System.out.println(en.getKey() + " " + en.getValue());
			System.out.println("********************");
			for (Map.Entry<Integer, String> m : hm.entrySet())
				System.out.println(m.getKey() + "    " + m.getValue());
			System.out.println("****************************");
			hm.remove(4);
			hm.remove(1, "Gitanjali");
			hm.replace(2, "Ravi");
			hm.replace(3, "sandip", "Ravi.k");
			System.out.println("********************");
			for (Map.Entry<Integer, String> m : hm.entrySet())
				System.out.println(m.getKey() + "    " + m.getValue());
			System.out.println("****************************");
			hm.replaceAll((Integer, String) -> "sandip");
			System.out.println("****************************");
			for (Map.Entry<Integer, String> m : hm.entrySet())
				System.out.println(m.getKey() + "    " + m.getValue());
			hm.clear();
			System.out.println("****************************");
			for (Map.Entry<Integer, String> m : hm.entrySet())
				System.out.println(m.getKey() + "    " + m.getValue());
			System.out.println("****************************");
		}
	}

}
