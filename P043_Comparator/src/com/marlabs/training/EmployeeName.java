package com.marlabs.training;

import java.util.*;

public class EmployeeName implements Comparator {
	@Override
	public int compare(Object o1, Object o2) {
		Employee ob1 = (Employee) o1; // we are creating out own object and assigning it to the compare() Object o1
										// and o2
		Employee ob2 = (Employee) o2;
		return ob1.name.compareTo(ob2.name);
	}
}