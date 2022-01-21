package com.marlabs.training.tests;

import com.marlabs.training.dao.DaoException;
import com.marlabs.training.dao.PersonDao;
import com.marlabs.training.dao.impl.JdbcPersonDao;
import com.marlabs.training.entity.Person;

public class DeletePerson {
	public static void main(String[] args) throws DaoException {
		PersonDao dao = new JdbcPersonDao();
		int id=101;
		dao.deletePerson(id);
		System.out.println("Person data deleted");
	}
}
