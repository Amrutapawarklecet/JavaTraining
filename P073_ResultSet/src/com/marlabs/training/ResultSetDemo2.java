package com.marlabs.training;

import java.sql.*;

public class ResultSetDemo2 {
	public static void main(String[] args) throws Exception {
		String driverclass = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/marlabs";
		String username = "root";
		String password = "Redmi@123";
		Class.forName(driverclass);
		Connection con = DriverManager.getConnection(url, username, password);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from student");
		ResultSetMetaData rsmd = rs.getMetaData();
		System.out.println("the no of coulmns in the table is " + rsmd.getColumnCount());
		System.out.println("the first column name is " + rsmd.getColumnName(1));
		System.out.println("the second column name is " + rsmd.getColumnName(2));
		System.out.println("the third column name is " + rsmd.getColumnName(3));
		System.out.println("The 1st column types are " + rsmd.getColumnTypeName(1));
		System.out.println("The 2nd column types are " + rsmd.getColumnTypeName(2));
		System.out.println("The 3rd column types are " + rsmd.getColumnTypeName(3));
		con.close();
	}
}