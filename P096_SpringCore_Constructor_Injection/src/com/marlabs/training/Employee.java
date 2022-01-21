//Create a employee class empno,name,email,phoneno

package com.marlabs.training;

import java.util.*;

public class Employee {
	private String empid, name;
	private List<String> projects;
	public Employee(String empid, String name, List<String> projects) {
		super();
		this.empid = empid;
		this.name = name;
		this.projects = projects;
	}
	
	public void display() {
		System.out.println("The id is:"+empid);
		System.out.println("The name is:"+name);
		System.out.println("Project Name are:");
		Iterator<String> itr=projects.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
	}
