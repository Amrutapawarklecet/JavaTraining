package com.marlabs.training.tests;

import java.util.*;

import com.marlabs.training.dao.DaoException;
import com.marlabs.training.dao.PersonDao;
import com.marlabs.training.dao.impl.JdbcPersonDao;
import com.marlabs.training.entity.Person;

public class GetPersonByPhone {
	public static void main(String[] args) throws DaoException {
		PersonDao dao = new JdbcPersonDao();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter phone number");
		String phone=sc.next();
		Person p=dao.getPersonByPhone(phone);
		if(p==null)
		System.out.println("Person data not added");
		else
			System.out.println(p);

	}
}
