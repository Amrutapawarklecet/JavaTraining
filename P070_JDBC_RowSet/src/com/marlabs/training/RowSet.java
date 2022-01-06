package com.marlabs.training;

import javax.sql.rowset.*;

import oracle.jdbc.rowset.OracleJDBCRowSet;

public class RowSet {
public static void main(String[] args) throws Exception  {
	JdbcRowSet rs=new OracleJDBCRowSet();
	rs.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
	rs.setUsername("system");
	rs.setPassword("1234");
	rs.setCommand("select * from marlabsstud");
	rs.execute();
	boolean first=rs.isBeforeFirst();//true
	boolean last=rs.isAfterLast();//false
	System.out.println("the cursor is at Before First :"+first);
	System.out.println("the cursor is at After Last :"+last);
	while(rs.next())
	{
		System.out.println(rs.getString(1)+"  "+rs.getString(2)+" "+rs.getString(3));
	}
	System.out.println("***********************************");
	while(rs.previous())
	{
		System.out.println(rs.getString(1)+"  "+rs.getString(2)+" "+rs.getString(3));
	}

	System.out.println("***********************************");
	rs.absolute(2);
	System.out.println(rs.getString(1)+"  "+rs.getString(2)+" "+rs.getString(3));
	System.out.println("***********************************");
	rs.absolute(1);
	System.out.println(rs.getString(1)+"  "+rs.getString(2)+" "+rs.getString(3));
	System.out.println("***********************************");
	rs.absolute(4);
	System.out.println(rs.getString(1)+"  "+rs.getString(2)+" "+rs.getString(3));
	System.out.println("***********************************");
	rs.absolute(-1); //it show the last one
	System.out.println(rs.getString(1)+"  "+rs.getString(2)+" "+rs.getString(3));
	System.out.println("***********************************");
	rs.first();
	System.out.println(rs.getString(1)+"  "+rs.getString(2)+" "+rs.getString(3));
	System.out.println("***********************************");
	rs.last();
	System.out.println(rs.getString(1)+"  "+rs.getString(2)+" "+rs.getString(3));
}
}
