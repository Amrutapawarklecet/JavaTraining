package com.marlabs.training;

import java.util.*;

public class Demo {

	public static void main(String[] args) {
		ArrayList<MarlabsEmp> a1=new ArrayList<MarlabsEmp>();
		a1.add(new MarlabsEmp(104, "amruta"));
		a1.add(new MarlabsEmp(103, "shubam"));
		a1.add(new MarlabsEmp(102, "afreen"));
		a1.add(new MarlabsEmp(101, "abhilasha"));
		Collections.sort(a1);
		for(MarlabsEmp obj:a1) {
			System.out.println(obj.empid);
		}

	}

}
