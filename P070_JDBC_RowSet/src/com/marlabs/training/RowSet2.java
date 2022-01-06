//Display data in XML format
package com.marlabs.training;

import javax.sql.rowset.*;

import oracle.jdbc.rowset.OracleWebRowSet;

public class RowSet2 {
public static void main(String[] args) throws Exception  {
	WebRowSet rs=new OracleWebRowSet();
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
	rs.writeXml(System.out);
	rs.close();
	}
}
