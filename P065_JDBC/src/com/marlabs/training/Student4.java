package com.marlabs.training;

import java.sql.*;

public class Student4 {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/marlabs", "root", "Redmi@123");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from marlabsstud");
		while (rs.next()) {
			System.out.println(rs.getInt(1) + "   " + rs.getString(2) + "  " + rs.getString(3));
		}

	}
}