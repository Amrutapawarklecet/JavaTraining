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
		try {
			Statement st = con.createStatement();
			st.addBatch("insert into student values(103,'abhi','bangalore')");
			st.addBatch("insert into student values(104,'samidha','bangalore')");
			st.addBatch("insert into student values(105,'archana','bangalore')");
			st.addBatch("delete from student where id=105");
			st.addBatch("update student set name='abhilasha' where id=103");
			st.executeBatch();
			con.commit();
			System.out.println("Success");
		} catch (Exception e) {
			e.printStackTrace();
		}
		con.close();
	}

}
