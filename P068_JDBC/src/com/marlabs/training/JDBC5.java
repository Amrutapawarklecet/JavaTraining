package com.marlabs.training;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBC5 {
	public static void main(String[] args) throws Exception {
		transaction();
	}

	private static void transaction() throws ClassNotFoundException, SQLException {

		String driverclass = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/marlabs";
		String username = "root";
		String password = "Redmi@123";
		String sql = "select * from employee_tbl";
		String sql2 = "update employee_tbl set empname=?,phoneno=?,salary=? where empno=?";
		Class.forName(driverclass);
		Connection con = DriverManager.getConnection(url, username, password);
		Statement st = null;
		PreparedStatement ps = null;
		System.out.println("***************************************");
		System.out.println("Enter 1 for SELECT ALL EMP");
		System.out.println("Enter 2 for SELECT EMP BY ID");
		System.out.println("Enter 3 for SELECTEMP BY NAME");
		System.out.println("Enter 4 for UPDATE EMP BY ID");
		System.out.println("***************************************");
		Scanner ob = new Scanner(System.in);
		System.out.println("ENETER YOUR CHOICE");
		int option = ob.nextInt();
		switch (option) {
		case 1:
			st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3) + " " + rs.getInt(4));
			}
			System.out.println("all rows selected");
			transaction();
			break;
		case 2:
			sql += " where empno=?";
			System.out.println(sql);
			System.out.println("enter empno");
			int empno = ob.nextInt();
			ps = con.prepareStatement(sql);// createStatement();
			ps.setInt(1, empno);
			ResultSet rs1 = ps.executeQuery();
			while (rs1.next()) {
				System.out
						.println(rs1.getInt(1) + " " + rs1.getString(2) + " " + rs1.getString(3) + " " + rs1.getInt(4));
			}
			transaction();
			break;
		case 3:
			sql += " where empname=?";
			System.out.println(sql);
			System.out.println("enter empname");
			String empname = ob.next();
			ps = con.prepareStatement(sql);
			ps.setString(1, empname);
			ResultSet rs2 = ps.executeQuery();
			while (rs2.next()) {
				System.out
						.println(rs2.getInt(1) + " " + rs2.getString(2) + " " + rs2.getString(3) + " " + rs2.getInt(4));
			}
			transaction();
			break;

		case 4:
			sql += " where empno=?";
			System.out.println(sql2);
			System.out.println("enter empno,empname,phoneno,salary");
			int empno1 = ob.nextInt();
			String empname1 = ob.next();
			int phoneno = ob.nextInt();
			int salary1 = ob.nextInt();
			ps = con.prepareStatement(sql2);
			ps.setString(1, empname1);
			ps.setInt(2, phoneno);
			ps.setInt(3, salary1);
			ps.setInt(4, empno1);
			int rs3 = ps.executeUpdate();
			System.out.println("Row Updateded");
			transaction();
			break;
		default:
			System.out.println("sorry wrong option you have enterd");
			break;
		}
		con.close();

	}
}
