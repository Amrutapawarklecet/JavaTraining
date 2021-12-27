package com.marlabs.training;

public class MarlabsEmp implements Comparable<MarlabsEmp> {

	String name;
	Integer empid;

	public MarlabsEmp(Integer empid, String name) {
		this.name = name;
		this.empid = empid;
	}

	@Override
	public int compareTo(MarlabsEmp obj) {
		return empid.compareTo(obj.empid);

	}

}
