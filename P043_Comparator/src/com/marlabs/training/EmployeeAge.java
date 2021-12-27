package com.marlabs.training;

import java.util.*;

public class EmployeeAge implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Employee ob1 = (Employee) o1;
		Employee ob2 = (Employee) o2;
		if (ob1.age == ob2.age)
			return 0;
		else if (ob1.age > ob2.age)
			return 1;
		else
			return -1;
	}

}