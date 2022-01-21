//Create a employee class empno,name,email,phoneno

package com.marlabs.training;

public class Employee {
	private String empno, name, email, phoneno;
	private Project project;
	public Employee(String empno, String name, String email, String phoneno, Project project) {
		super();
		this.empno = empno;
		this.name = name;
		this.email = email;
		this.phoneno = phoneno;
		this.project = project;
	}
	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", name=" + name + ", email=" + email + ", phoneno=" + phoneno
				+ ", project=" + project + "]";
	}

	}
