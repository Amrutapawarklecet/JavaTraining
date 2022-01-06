package com.marlabs.training;

import java.sql.*;

public class Function1 {

	public static void main(String[] args) throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","1234");
		CallableStatement st1=con.prepareCall("{?=call addno(?,?)}");
		st1.registerOutParameter(1,Types.INTEGER);
		st1.setInt(2,10);
		st1.setInt(3,50);
		st1.execute();
		int n=st1.getInt(1);
		System.out.println("The result is "+n);

	}

}
