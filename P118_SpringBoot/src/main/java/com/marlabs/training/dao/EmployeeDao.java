package com.marlabs.training.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.marlabs.training.entity.Employee;

@Component
public class EmployeeDao {

	@Autowired
	private JdbcTemplate jt;

	public void addEmployee(Employee e) {

		String sql = "insert into employee2 values(?,?,?)";
		int count = jt.update(sql, e.getEmpid(), e.getEmpname(), e.getMail());
		System.out.println("data inserted " + count);
	}

	public void updateEmployee(Employee e) {
		String sql = "update employee2 set empname=?,mail=? where empid=?";
		int count = jt.update(sql, e.getEmpname(), e.getMail(), e.getEmpid());
		System.out.println("data updated " + count);

	}

	public void deleteEmployee(int empid) {
		String sql = "delete from employee2 where empid=?";
		int count = jt.update(sql, empid);
		System.out.println("row deleted " + count);

	}

	public List<Employee> getAllEmployee() {

		return jt.query("select * from employee2", new RowMapper<Employee>() {
			public Employee mapRow(ResultSet rs, int rownumber) throws SQLException {
				Employee e = new Employee();
				e.setEmpid(rs.getLong(1));
				e.setEmpname(rs.getString(2));
				e.setMail(rs.getString(3));
				// System.out.println(rownumber);
				return e;
			}
		});
	}

	public Employee getEmployeeById(int empId) {
		String xyz = "select * from Employee2 where empid=" + empId;
		return jt.query(xyz, new ResultSetExtractor<Employee>() {
			public Employee extractData(ResultSet rs) throws SQLException, DataAccessException {
				Employee e = new Employee();
				if (rs.next()) {
					e.setEmpid(rs.getLong(1));
					e.setEmpname(rs.getString(2));
					e.setMail(rs.getString(3));
				}
				return e;
			}
		});
	}

}
