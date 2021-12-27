package com.marlabs.training.arrays;

public class Address {
	int streetno, roadno;
	String city, state;

	public Address(int streetno, int roadno, String city, String state) {
		this.streetno = streetno;
		this.roadno = roadno;
		this.city = city;
		this.state = state;
	}

	//toString method for convert object into string
	@Override
	public String toString() {
		return "Address [streetno=" + streetno + ", roadno=" + roadno + ", city=" + city + ", state=" + state + "]";
	}

	public static void main(String[] args) {
		Address address = new Address(10, 20, "Bangalore", "Karnataka");
		Employee emp = new Employee(101, "amruta", "7766", address);
		emp.display();
	}

}
