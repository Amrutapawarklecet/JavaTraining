
package com.marlabs.training;

public class Employee {

	int empno;
	String name;
	float salary;

	public Employee(int empno, String name, float salary) {
		super();
		this.empno = empno;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", name=" + name + ", salary=" + salary + "]";
	}

}
