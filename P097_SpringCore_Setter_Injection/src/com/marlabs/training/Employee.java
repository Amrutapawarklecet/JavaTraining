//Create a employee class empno,name,email,phoneno

package com.marlabs.training;

import java.util.*;

public class Employee {
	private String empid, name;
	private List<String> projects;
	
	public String getEmpid() {
		return empid;
	}

	public void setEmpid(String empid) {
		this.empid = empid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getProjects() {
		return projects;
	}

	public void setProjects(List<String> projects) {
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
