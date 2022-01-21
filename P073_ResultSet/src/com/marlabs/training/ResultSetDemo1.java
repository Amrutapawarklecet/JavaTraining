package com.marlabs.training;

import java.sql.*;

public class ResultSetDemo1 {
	public static void main(String[] args) throws Exception {
		String driverclass = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/marlabs";
		String username = "root";
		String password = "Redmi@123";
		Class.forName(driverclass);
		Connection con = DriverManager.getConnection(url, username, password);
		Statement st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
		ResultSet rs = st.executeQuery("select * from student");
		rs.absolute(2);
		System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3));
		rs.absolute(-1);
		System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3));
		con.close();
	}
}
