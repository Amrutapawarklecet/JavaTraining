package com.marlabs.training.tests;

import java.util.List;

import com.marlabs.training.dao.DaoException;
import com.marlabs.training.dao.PersonDao;
import com.marlabs.training.dao.impl.JdbcPersonDao;
import com.marlabs.training.entity.Person;

public class GetAllPerson {
	public static void main(String[] args) throws DaoException {
		PersonDao dao = new JdbcPersonDao();
		List<Person> list = dao.getAllPersons();
		for (Person p : list) {
			System.out.println(p.getId() + " " + p.getFirstName() + " " + p.getLastName());
		}
	}
}
