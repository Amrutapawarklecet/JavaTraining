package com.marlabs.training;

import java.sql.*;

public class BatchDemo {
	public static void main(String[] args) throws Exception {
		String driverclass = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/marlabs";
		String username = "root";
		String password = "Redmi@123";
		Class.forName(driverclass);
		Connection con = DriverManager.getConnection(url, username, password);
		con.setAutoCommit(false);
		Statement st = con.createStatement();
		st.addBatch("insert into student values(2,'shubham','bangalore')");
		st.addBatch("insert into student values(3,'shatish','bangalore')");
		st.addBatch("insert into student values(4,'sunil','bangalore')");
		st.addBatch("delete from student where id=101");
		st.addBatch("update student set address='hyd' where id=3");
		st.executeBatch();
		con.commit();
		System.out.println("Operation Successful");
	}
}
