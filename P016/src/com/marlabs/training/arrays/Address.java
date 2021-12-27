package com.marlabs.training.arrays;

public class Address extends Marks {
	String loc;

	Address(int rollno, String name, String address, int phy, int chem, int math, String loc) {
		super(rollno, name, address, phy, chem, math);
		this.loc=loc;
	}
	void display() {
		super.display();
		System.out.println("The location is:"+loc);

	}
	public static void main(String[] args) {
		
		Address ad=new Address(1001,"sandip","Bangalore",77,77,55,"north bangalore");
		ad.display();
	}

}
