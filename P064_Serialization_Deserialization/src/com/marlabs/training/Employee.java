/*wap to store data of few employees into a files and retrive it using serialization and de-serialization.
employee class (empno,name,salary,designation)*/
package com.marlabs.training;

import java.io.Serializable;

public class Employee implements Serializable {

	int empno;
	String name, designation;
	float salary;
	public Employee(int empno, String name, String designation, float salary) {
		super();
		this.empno = empno;
		this.name = name;
		this.designation = designation;
		this.salary = salary;
	}
	
	
}
