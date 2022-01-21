package com.marlabs.training.util;
import java.sql.*;

import com.marlabs.training.dao.DaoException;

public class DbUtil 
{

public static Connection getConnection() throws DaoException, Exception
{
	String driver,url,user,password;
	driver="com.mysql.cj.jdbc.Driver";
	url="jdbc:mysql://localhost:3306/marlabs";
	user="root";
	password="Redmi@123";
	Class.forName(driver);
	return DriverManager.getConnection(url,user,password);
}
}
