package com.marlabs.training;

import java.sql.*;
import java.util.*;

public class JDBC4 {
	public static void main(String[] args) throws Exception {
		String driverclass = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/marlabs";
		String username = "root";
		String password = "Redmi@123";
		String sql = "delete from studentm";
		String sql1 = "truncate table studentm";
		Class.forName(driverclass);
		Connection con = DriverManager.getConnection(url, username, password);
		PreparedStatement st = null;
		System.out.println("************************************");
		System.out.println("MENU");
		System.out.println("1.DELETE ALL STUDENTS");
		System.out.println("2.DELETE BY ID");
		System.out.println("3.DELETE BY NAME");
		System.out.println("4.DELETE BY ADDRESS");
		System.out.println("*************************************");
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter your Choice");
		int option = ob.nextInt();
		switch (option) {
		case 1:
			st = con.prepareStatement(sql1);
			System.out.println("deleted all rows");
			break;
		case 2:
			sql += " where studid=?";
			System.out.println(sql);
			System.out.println("enter studid");
			int studid = ob.nextInt();
			st = con.prepareStatement(sql);
			st.setInt(1, studid);
			break;
		case 3:
			sql += " where name=?";
			System.out.println(sql);
			System.out.println("enter name");
			String name = ob.next();
			st = con.prepareStatement(sql);
			st.setString(1, name);
			break;
		case 4:
			sql += " where address=?";
			System.out.println(sql);
			System.out.println("enter address");
			String address = ob.next();
			st = con.prepareStatement(sql);
			st.setString(1, address);
			break;
		default:
			System.out.println("sorry wrong option");
			break;
		}
		int count = st.executeUpdate();
		if (count == 0)
			System.out.println("sorry no rows updated");
		else
			System.out.println("Rows updated is :" + count);
		con.close();
	}
}
