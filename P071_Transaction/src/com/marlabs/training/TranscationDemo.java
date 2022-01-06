package com.marlabs.training;

import java.sql.*;

public class TranscationDemo {

	public static void main(String[] args) throws Exception {
		String driverclass = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/marlabs";
		String username = "root";
		String password = "Redmi@123";
		String sql = "insert into student values(102,'afreen','Bangalore')";
		Class.forName(driverclass);
		Connection con=DriverManager.getConnection(url,username,password);
		con.setAutoCommit(false);
		try {
			Statement st=con.createStatement();
			st.execute(sql);
			System.out.println("Row inserted");
			con.commit();
		} catch (Exception e) {
			System.out.println("Error");
			con.rollback();
		}
		con.close();
	}

}
