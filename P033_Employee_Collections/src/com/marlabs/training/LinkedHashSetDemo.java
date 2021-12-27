package com.marlabs.training;

import java.util.*;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		Employee e1 = new Employee(101, "amruta", 25000f);
		Employee e2 = new Employee(101, "afreen", 30000f);
		Employee e3 = new Employee(101, "abhilasha", 35000f);
		LinkedHashSet<Employee> ts = new LinkedHashSet<Employee>();
		ts.add(e1);
		ts.add(e2);
		ts.add(e3);
		System.out.println(ts);

	}
}
