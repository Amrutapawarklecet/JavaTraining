package com.marlabs.training;

import java.sql.*;
import java.util.*;

public class Student6 {
	public static void main(String[] args) throws Exception {
		transaction();
	}

	private static void transaction() throws ClassNotFoundException, SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println(
				"please enter ur choice:\n" + "1 for insert\n" + "2 for update\n" + "3 for delete\n" + "4 for display");
		int choice = sc.nextInt();
		switch (choice) {
		case (1):
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/marlabs", "root", "Redmi@123");
			Scanner ob = new Scanner(System.in);
			System.out.println("enter empno,name,address");
			int sid = ob.nextInt();
			String sname = ob.next();
			String saddress = ob.next();
			PreparedStatement st = con.prepareStatement("insert into studentm_tbl values(?,?,?)");
			st.setInt(1, sid);// 1 represent the first ?
			st.setString(2, sname);// 2 represent the second ?
			st.setString(3, saddress);// 3 represenr the third ?
			st.execute();
			System.out.println("row inserted");
			transaction();
			break;
		case (2):
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/marlabsstud", "root",
					"Root@123");
			Scanner ob2 = new Scanner(System.in);
			Statement st2 = con2.createStatement();
			st2.execute("update studentm_tbl set saddress='Kolkotta' where sid=102");
			System.out.println("Row updated");
			transaction();
			break;
		case (3):
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con3 = DriverManager.getConnection("jdbc:mysql://localhost:3306/marlabsstud", "root",
					"Root@123");
			Scanner ob3 = new Scanner(System.in);
			System.out.println("enter sid u want delete");
			int empno = ob3.nextInt();
			PreparedStatement st3 = con3.prepareStatement("delete from studentm_tbl where sid=?");
			st3.setInt(1, empno);
			st3.execute();
			System.out.println("row deleted");
			transaction();
			break;
		case (4):
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con4 = DriverManager.getConnection("jdbc:mysql://localhost:3306/marlabsstud", "root",
					"Root@123");
			Statement st4 = con4.createStatement();
			ResultSet rs4 = st4.executeQuery("select * from studentm_tbl");
			while (rs4.next()) {
				System.out.println(rs4.getInt(1) + " " + rs4.getString(2) + " " + rs4.getString(3));
			}
			transaction();
			break;
		}
	}
}
