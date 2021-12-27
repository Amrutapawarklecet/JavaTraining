package com.marlabs.training;

import java.util.*;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<Integer> ls = new ArrayList<Integer>();
		ls.add(Integer.valueOf(10));//convert object to primitive data type
		ls.add(20);//internally convert object to primitive data type
		ls.add(30);
		ls.add(50);
		ls.add(40);
		Collections.sort(ls,Collections.reverseOrder());
		ls.forEach((x) -> System.out.println(x));
		
	}

}
