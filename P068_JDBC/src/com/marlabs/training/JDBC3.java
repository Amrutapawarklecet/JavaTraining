package com.marlabs.training;

import java.sql.*;
import java.util.*;

public class JDBC3 {
	public static void main(String[] args) throws Exception {
		String driverclass = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/marlabs";
		String username = "root";
		String password = "Redmi@123";
		String sql = "insert into studentm values(?,?,?)";
		Class.forName(driverclass);
		Connection con = DriverManager.getConnection(url, username, password);
		PreparedStatement st = con.prepareStatement(sql);
		Scanner ob = new Scanner(System.in);
		System.out.println("enter studid,name,address");
		int studid = ob.nextInt();
		String name = ob.next();
		String address = ob.next();
		st.setInt(1, studid);
		st.setString(2, name);
		st.setString(3, address);
		int count = st.executeUpdate();
		System.out.println("inserted row = " + count);
	}
}
