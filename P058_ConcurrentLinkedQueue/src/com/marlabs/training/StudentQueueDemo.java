package com.marlabs.training;

import java.util.concurrent.ConcurrentLinkedQueue;

public class StudentQueueDemo {
	String rollno, name, college;

	public StudentQueueDemo(String rollno, String name, String college) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.college = college;
	}

	@Override
	public String toString() {
		return "StudentQueueDemo [rollno=" + rollno + ", name=" + name + ", college=" + college + "]";
	}

	public static void main(String[] args) {
		StudentQueueDemo ob1 = new StudentQueueDemo("MCA101", "sandip", "ABC");
		StudentQueueDemo ob2 = new StudentQueueDemo("MCA102", "sunil", "ABC");
		StudentQueueDemo ob3 = new StudentQueueDemo("MCA103", "shubham", "ABC");
		StudentQueueDemo ob4 = new StudentQueueDemo("MCA104", "satish", "ABC");
		ConcurrentLinkedQueue<StudentQueueDemo> clq = new ConcurrentLinkedQueue<StudentQueueDemo>();
		clq.add(ob1);
		clq.add(ob2);
		clq.add(ob3);
		clq.add(ob4);
		for (StudentQueueDemo stq : clq)
			System.out.println(stq);

	}
}