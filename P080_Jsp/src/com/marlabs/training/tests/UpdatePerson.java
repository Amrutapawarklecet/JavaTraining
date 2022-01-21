package com.marlabs.training.tests;

import java.util.Scanner;

import com.marlabs.training.dao.DaoException;
import com.marlabs.training.dao.PersonDao;
import com.marlabs.training.dao.impl.JdbcPersonDao;
import com.marlabs.training.entity.Person;

public class UpdatePerson {
	public static void main(String[] args) throws DaoException {		
		PersonDao dao = new JdbcPersonDao();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id");
		int id=sc.nextInt();
		Person p=dao.getPerson(id);
		if(id==p.getId())
		{
				System.out.println("Enter id,firstname,lastname,phone,email");
				int id1=sc.nextInt();
				String firstname=sc.next();
				String lastname=sc.next();
				String phone=sc.next();
				String email=sc.next();
				Person person1 = new Person(id1,firstname,lastname,phone,email);
				dao.updatePerson(person1);
				System.out.println("Person updated");

			}
		else
			System.out.println("Person not persent with this id");
	}
}
