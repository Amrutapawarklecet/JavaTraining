/*T- Type of the first Argument.
U-Type of the second Argument.  
R-Return type of the result
*/
package com.marlabs.training;

import java.util.concurrent.*;

public class ConcurrentHashMapDemo {
	public static void main(String[] args) {
		ConcurrentHashMap<String, Integer> chm = new ConcurrentHashMap<String, Integer>();

		ConcurrentHashMap<String, Integer> chm1 = chm;

		ConcurrentHashMap<String, Integer> chm2 = new ConcurrentHashMap<String, Integer>();
		chm.put("sandip", 100);
		chm.put("sunil", 40);
		chm.put("sandy", 60);

		chm2.put("sumeet", 50);
		chm2.put("shubham", 70);
		System.out.println(chm);
		System.out.println(chm2);

		System.out.println("we are comparing 2 maps :" + chm.equals(chm1));
		System.out.println("we are comparing 2 maps :" + chm.equals(chm2));
	}
}