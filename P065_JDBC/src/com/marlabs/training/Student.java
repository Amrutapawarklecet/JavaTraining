//Insert
package com.marlabs.training;

import java.sql.*;

public class Student {
	public static void main(String[] args) throws Exception {
		// to load the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		// to get connection from DriverManager
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/marlabs", "root", "Redmi@123");
		// jdbc--protocal ,
		// oracle is ---database,
		// thin--type 4 driver,
		// localhost--both server and client reside in the same machine
		// localhost (IP address of the server :123.12.34.4),default port no :1521,
		// xe is the database name,
		// system--username
		// 1234 is the password.
		// Statement()/preparedStatement(pass the sql query)
		Statement st = con.createStatement();
		// execute(pass the sql query)/execute();
		st.execute("insert into marlabsstud values(101,'Shubam','Bangalore')");// static query
		System.out.println("Row Inserted");
	}
}
