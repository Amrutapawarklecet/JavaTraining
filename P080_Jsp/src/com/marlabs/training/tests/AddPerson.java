package com.marlabs.training.tests;

import java.util.*;

import com.marlabs.training.dao.DaoException;
import com.marlabs.training.dao.PersonDao;
import com.marlabs.training.dao.impl.JdbcPersonDao;
import com.marlabs.training.entity.Person;

public class AddPerson {
	public static void main(String[] args) throws DaoException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id,firstname,lastname,phone,email");
		int id=sc.nextInt();
		String firstname=sc.next();
		String lastname=sc.next();
		String phone=sc.next();
		String email=sc.next();
		Person person = new Person(id,firstname,lastname,phone,email);
		PersonDao dao = new JdbcPersonDao();
		dao.addPerson(person);
		System.out.println("Person data added");
	}
}
