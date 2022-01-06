//wap to insert data,update data,delete data,read data from a table employee (empno,name,salary,DOJ);

package com.marlabs.training;

import java.sql.*;
import java.util.*;

public class JDBC6 {
	public static void main(String[] args) throws Exception {
		Function();
	}

	private static void Function() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/marlabs", "root", "Redmi@123");
		Statement st = null;
		PreparedStatement ps = null;
		Scanner ob = new Scanner(System.in);
		System.out.println(
				"please enter ur choice:\n" + "1 for display\n" + "2 for insert\n" + "3 for update\n" + "4 for delete");
		int choice = ob.nextInt();
		switch (choice) {
		case 1:
			st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from employee");
			while (rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4));
			}
			Function();
			break;
		case 2:
			ps = con.prepareStatement("insert into employee values(?,?,?,?)");
			System.out.println("enter empno,name,salary,DOJ");
			int empno = ob.nextInt();
			String name = ob.next();
			String salary = ob.next();
			String DOJ = ob.next();
			ps.setInt(1, empno);
			ps.setString(2, name);
			ps.setString(3, salary);
			ps.setString(4, DOJ);
			ps.execute();
			System.out.println("row inserted");
			Function();
			break;
		case 3:
			ps = con.prepareStatement("update employee set name=?,salary=?,DOJ=? where empno=?");
			System.out.println("enter name,salary,DOJ,empno");
			String name1 = ob.next();
			String salary1 = ob.next();
			String DOJ1 = ob.next();
			int empno1 = ob.nextInt();
			ps.setString(1, name1);
			ps.setString(2, salary1);
			ps.setString(3, DOJ1);
			ps.setInt(4, empno1);
			ps.execute();
			System.out.println("row updated");
			Function();
			break;
		case 4:
			ps = con.prepareStatement("delete from employee where empno=?");
			System.out.println("Enter empno");
			int empno3 = ob.nextInt();
			ps.setInt(1, empno3);
			ps.execute();
			System.out.println("row deleted");
			Function();
			break;
		default:
			System.out.println("u have enterd wrong option please enter correct option");
			Function();
			break;
		}
	}
}
