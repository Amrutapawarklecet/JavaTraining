package com.marlabs.training.dao.impl;

import java.sql.*;
import java.util.*;

import com.marlabs.training.dao.DaoException;
import com.marlabs.training.dao.PersonDao;
import com.marlabs.training.entity.Person;
import com.marlabs.training.util.DbUtil;

public class JdbcPersonDao implements PersonDao {

	@Override
	public void addPerson(Person person) throws DaoException {
		Connection conn = null;
		PreparedStatement st = null;
		try {
			String sql = "insert into person values(?,?,?,?,?)";
			conn = DbUtil.getConnection();
			st = conn.prepareStatement(sql);
			st.setInt(1, person.getId());
			st.setString(2, person.getFirstName());
			st.setString(3, person.getLastName());
			st.setString(4, person.getPhone());
			st.setString(5, person.getEmail());
			st.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public Person getPerson(int id) throws DaoException {
		Connection conn = null;
		PreparedStatement st = null;
		ResultSet rs = null;
		try {
			String sql = "select * from person where id=?";
			conn = DbUtil.getConnection();
			st = conn.prepareStatement(sql);
			st.setInt(1, id);
			rs = st.executeQuery();
			if (rs.next()) {
				Person person = getPersonFromResultSet(rs);
				return person;
			}
		} catch (Exception ae) {
			ae.printStackTrace();
		}
		return null;
	}

	private Person getPersonFromResultSet(ResultSet rs) throws SQLException {
		Person person = new Person();
		person.setId(rs.getInt("id"));
		person.setFirstName(rs.getString("firstname"));
		person.setLastName(rs.getString("lastname"));
		person.setPhone(rs.getString("phone"));
		person.setEmail(rs.getString("email"));
		return person;
	}

	@Override
	public void updatePerson(Person person) throws DaoException {
		Connection conn = null;
		PreparedStatement st = null;
		ResultSet rs = null;
		try {
			String sql = "update person set firstname=?,lastname=?,phone=?,email=? where id=?";
			conn = DbUtil.getConnection();
			st = conn.prepareStatement(sql);
			st.setString(1,person.getFirstName());
			st.setString(2, person.getLastName());
			st.setString(3, person.getPhone());
			st.setString(4, person.getEmail());
			st.setInt(4, person.getId());
			st.execute();

			}
		 catch (Exception ae) {
			ae.printStackTrace();
		}
	
	}
	

	@Override
	public void deletePerson(int id) throws DaoException {
		Connection conn = null;
		PreparedStatement st = null;
		try {
			String sql = "delete from person where id=?";
			conn = DbUtil.getConnection();
			st = conn.prepareStatement(sql);
			st.setInt(1, id);
			if (st.executeUpdate() == 0) {
				throw new DaoException("No Data found");
			}
		} catch (Exception ae) {
			ae.printStackTrace();
		}
	}

	@Override
	public List getAllPersons() throws DaoException {
		Connection conn = null;
		PreparedStatement st = null;
		ResultSet rs = null;
		List list = new ArrayList();
		try {
			String sql = "select * from person";
			conn = DbUtil.getConnection();
			st = conn.prepareStatement(sql);
			rs = st.executeQuery();
			while (rs.next()) {
				Person person = getPersonFromResultSet(rs);
				list.add(person);
			}
		} catch (Exception ae) {
			ae.printStackTrace();
		}
		return list;
	}

	@Override
	public Person getPersonByPhone(String phone) throws DaoException {
		Connection conn = null;
		PreparedStatement st = null;
		ResultSet rs = null;
		try {
			String sql = "select * from person where phone=?";
			conn = DbUtil.getConnection();
			st = conn.prepareStatement(sql);
			st.setString(1, phone);
			rs = st.executeQuery();
			if (rs.next()) {
				Person person = getPersonFromResultSet(rs);
				return person;
			}
		} catch (Exception ae) {
			ae.printStackTrace();
		}
		return null;

	}

}
