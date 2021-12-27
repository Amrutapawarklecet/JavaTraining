package com.marlabs.training;

public class Customer {

	int custid;
	String name,address;
	public Customer(int custid, String name, String address) {
		super();
		this.custid = custid;
		this.name = name;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Customer [custid=" + custid + ", name=" + name + ", address=" + address + "]";
	}
	
	public static void main(String[] args) {
		
		Customer customer=new Customer(101, "Deepak", "Bangalore");
		Bank b=new Bank(50754455, "Cannara", 30000, customer);
		b.display();
	}


}
