package com.marlabs.training;

import java.sql.*;
import java.sql.DriverManager;

public class JDBC1 {

	public static void main(String[] args) throws Exception {
		String driverclass = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/marlabs";
		String username = "root";
		String password = "Redmi@123";
		String sql = "insert into student_tbl values(109,'shubham','Bangalore')";
		Class.forName(driverclass);
		Connection con = DriverManager.getConnection(url, username, password);
		Statement st = con.createStatement();
		int count = st.executeUpdate(sql);
		System.out.println("inserted row = " + count);
	}

}
