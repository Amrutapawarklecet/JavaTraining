package com.marlabs.training.entity;


public class Employee {

	private long empid;
	private String empname, mail;

	public long getEmpid() {
		return empid;
	}

	public void setEmpid(long empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public Employee() {
		super();
		this.empid = empid;
		this.empname = empname;
		this.mail = mail;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", mail=" + mail + "]";
	}

}
