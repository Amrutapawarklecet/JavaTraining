package com.marlabs.training;

import java.util.*;

public class ListToArrayDemo {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("apple");
		list.add("orange");
		list.add("graphes");
		list.add("strawberry");
		System.out.println("List is:"+list);
		
		//convert list to array
		String arr[]=list.toArray(new String[list.size()]);
		System.out.println("array is:"+Arrays.toString(arr));
	}

}
