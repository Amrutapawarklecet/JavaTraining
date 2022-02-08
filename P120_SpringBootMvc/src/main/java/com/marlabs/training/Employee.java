package com.marlabs.training;

import java.util.List;

public class Employee {
	private Integer empid;
	private String empName;
	private Double empSal;
	private String empGen;
	private String empProj;
	private String empAddr;
	private List<String> empLang;
	private String empDoj;
	private List<String> empBranch;
	public Integer getEmpid() {
		return empid;
	}
	public void setEmpid(Integer empid) {
		this.empid = empid;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Double getEmpSal() {
		return empSal;
	}
	public void setEmpSal(Double empSal) {
		this.empSal = empSal;
	}
	public String getEmpGen() {
		return empGen;
	}
	public void setEmpGen(String empGen) {
		this.empGen = empGen;
	}
	public String getEmpProj() {
		return empProj;
	}
	public void setEmpProj(String empProj) {
		this.empProj = empProj;
	}
	public String getEmpAddr() {
		return empAddr;
	}
	public void setEmpAddr(String empAddr) {
		this.empAddr = empAddr;
	}
	public List<String> getEmpLang() {
		return empLang;
	}
	public void setEmpLang(List<String> empLang) {
		this.empLang = empLang;
	}
	public String getEmpDoj() {
		return empDoj;
	}
	public void setEmpDoj(String empDoj) {
		this.empDoj = empDoj;
	}
	public List<String> getEmpBranch() {
		return empBranch;
	}
	public void setEmpBranch(List<String> empBranch) {
		this.empBranch = empBranch;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empName=" + empName + ", empSal=" + empSal + ", empGen=" + empGen
				+ ", empProj=" + empProj + ", empAddr=" + empAddr + ", empLang=" + empLang + ", empDoj=" + empDoj
				+ ", empBranch=" + empBranch + "]";
	}

}
