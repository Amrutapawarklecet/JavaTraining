package com.marlabs.training.dao;

import java.util.List;

import com.marlabs.training.entity.Person;

public interface PersonDao {
	public void addPerson(Person person) throws DaoException;

	public Person getPerson(int id) throws DaoException;

	public void updatePerson(Person person) throws DaoException;

	public void deletePerson(int id) throws DaoException;

	public List getAllPersons() throws DaoException;

	public Person getPersonByPhone(String phone) throws DaoException;
}
