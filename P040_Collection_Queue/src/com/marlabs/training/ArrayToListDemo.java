//convert array to list
//manually have to traverse the array and add the element into list one by one
package com.marlabs.training;

import java.util.*;

public class ArrayToListDemo {

	public static void main(String[] args) {

		//array
		String arr[]= {"Subham","Ajay","Trupti","Sunil"};
		System.out.println("Array is:"+Arrays.toString(arr));
		//convert array to list
		ArrayList<String> list=new ArrayList<String>();
		for(String str:arr) {
			list.add(str);
		}
		System.out.println("List is:"+list);
		
	}

}
