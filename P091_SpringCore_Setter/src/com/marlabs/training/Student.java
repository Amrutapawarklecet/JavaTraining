package com.marlabs.training;

public class Student {
	private String name, address, email;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void display() {
		System.out.println("the name is " + name);
		System.out.println("the address is " + address);
		System.out.println("the email is " + email);
	}

}
