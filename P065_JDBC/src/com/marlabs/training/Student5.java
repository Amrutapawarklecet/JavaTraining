package com.marlabs.training;

import java.sql.*;
import java.util.*;

public class Student5 {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/marlabs", "root", "Redmi@123");
		Scanner ob = new Scanner(System.in);
		System.out.println("enter empno,name,address");
		int empno = ob.nextInt();
		String name = ob.next();
		String address = ob.next();
		PreparedStatement st = con.prepareStatement("insert into marlabsstud values(?,?,?)");
		st.setInt(1, empno);// 1 represent the first ?
		st.setString(2, name);// 2 represent the second ?
		st.setString(3, address);// 3 represenr the third ?
		st.execute();
		System.out.println("row inserted");
	}
}
