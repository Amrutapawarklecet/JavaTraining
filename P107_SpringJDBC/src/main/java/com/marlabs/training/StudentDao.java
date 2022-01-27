package com.marlabs.training;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.ResultSetExtractor;
public class StudentDao 
{
private JdbcTemplate jdbcTemplate;

public JdbcTemplate getJdbcTemplate() {
	return jdbcTemplate;
}

public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
	this.jdbcTemplate = jdbcTemplate;
}

public List<Student> getAllStudent()
{
	return jdbcTemplate.query("select * from student", new ResultSetExtractor<List<Student>>()
			{
			public List<Student> extractData(ResultSet rs)throws SQLException,DataAccessException
			{
				List<Student> list=new ArrayList<Student>();
				while(rs.next())
				{
		Student s=new Student();
		s.setRollno(rs.getInt(1));
		s.setName(rs.getString(2));
		s.setAddress(rs.getString(3));
	list.add(s);
			}
				return list;
			}
			});			
			}

public Boolean saveStudent(final Student s)
{
	String xyz="insert into student values(?,?,?)";
	return jdbcTemplate.execute(xyz,new PreparedStatementCallback<Boolean>()
			{
		@Override
		public Boolean doInPreparedStatement(PreparedStatement ps)
				throws SQLException , DataAccessException
		{
			ps.setInt(1,s.getRollno());
			ps.setString(2,s.getName());
			ps.setString(3, s.getAddress());
			return ps.execute();
		}
			});
			
}
public Boolean updateStudent(final Student s)
{
	String xyz="update student set name=?,address=? where rollno=?";
	return jdbcTemplate.execute(xyz,new PreparedStatementCallback<Boolean>()
			{
		@Override
		public Boolean doInPreparedStatement(PreparedStatement ps)
				throws SQLException , DataAccessException
		{
			ps.setString(1,s.getName());
			ps.setString(2, s.getAddress());
			ps.setInt(3,s.getRollno());
			return ps.execute();
		}
			});


}

public Boolean deleteStudent(Student s) {
	String xyz="delete student  where rollno=?";
	return jdbcTemplate.execute(xyz,new PreparedStatementCallback<Boolean>()
			{
		@Override
		public Boolean doInPreparedStatement(PreparedStatement ps)
				throws SQLException , DataAccessException
		{
		
			ps.setInt(1,s.getRollno());
			return ps.execute();
		}
			});

}
}




