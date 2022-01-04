package com.marlabs.training;

import java.sql.*;

public class JDBC2 {

	public static void main(String[] args) throws Exception {
		String driverclass = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String username = "system";
		String password = "1234";
		String sql = "insert into empmarlabs values(101,'shubham','7766554433',19000)";
		Class.forName(driverclass);
		Connection con = DriverManager.getConnection(url, username, password);
		Statement st = con.createStatement();
		int count = st.executeUpdate(sql);
		System.out.println("inserted row = " + count);
	}
}
