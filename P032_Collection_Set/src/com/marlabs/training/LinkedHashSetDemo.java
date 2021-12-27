//LinkedHasSet ->Display the data in same order means how we added or displayed that same order
package com.marlabs.training;

import java.util.*;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		Student s1=new Student(101,"amruta","Bangalore");
		Student s2=new Student(102,"afreen","Bangalore");
		Student s3=new Student(101,"abhilasha","Bangalore");
		LinkedHashSet<Student> ts = new LinkedHashSet<Student>();
		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		System.out.println(ts);

	}
}
