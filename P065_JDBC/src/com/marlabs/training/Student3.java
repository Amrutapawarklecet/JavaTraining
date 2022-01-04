package com.marlabs.training;

import java.sql.*;

public class Student3 {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/marlabs", "root", "Redmi@123");
		Statement st = con.createStatement();
		st.execute("delete from marlabsstud where empno=101");
		System.out.println("Row deleted");
	}
}
