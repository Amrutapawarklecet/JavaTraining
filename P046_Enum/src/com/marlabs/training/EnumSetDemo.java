//EnumSet :- it sort the data according to the enum list provided.

package com.marlabs.training;

import java.util.*;

enum days {
	SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

public class EnumSetDemo {
	public static void main(String[] args) {
		EnumSet es = EnumSet.of(days.FRIDAY, days.MONDAY, days.SUNDAY, days.TUESDAY);
		Iterator itr = es.iterator();
		while (itr.hasNext())
			System.out.println(itr.next());
		EnumSet es1 = EnumSet.allOf(days.class);
		System.out.println("the weeks days are :" + es1);
		EnumSet es2 = EnumSet.noneOf(days.class);
		System.out.println("the weeks days are :" + es2);
	}
}
