//	EnumMap :- in this we will enter key and value pair.

package com.marlabs.training;

import java.util.*;

enum day {
	SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

public class EnumMapDemo {
	public static void main(String[] args) {
		EnumMap<day, String> em = new EnumMap<day, String>(day.class);
		em.put(day.SUNDAY, "Taken Rest");
		em.put(day.MONDAY, "Project Work");
		em.put(day.TUESDAY, "Collection");
		for (Map.Entry m : em.entrySet())
			System.out.println(m.getKey() + "     " + m.getValue());
	}
}
