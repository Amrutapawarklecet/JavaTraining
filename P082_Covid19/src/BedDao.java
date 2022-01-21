import java.io.*;
import java.sql.*;
import java.util.*;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet("/BedDao")
public class BedDao extends HttpServlet 
{
	public static Connection getConnection()
	{
		Connection con=null;
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","1234");
		}
		catch(Exception ae)
		{	ae.printStackTrace();}
		return con;
	}

public static int save(Bed b)
{
	int status=0;
	try
	{
		Connection con=BedDao.getConnection();
		PreparedStatement ps=con.prepareStatement("insert into corona(id,name,registerdate) values(crud2.nextval,?,?)");
		ps.setString(1, b.getName());
		ps.setString(2, b.getRegisterdate());
		status=ps.executeUpdate();
	}
	catch(Exception ae)
	{
		ae.printStackTrace();
	}
	return status;
}
public static int update(Bed b)
{
	int status=0;
	try
	{
		Connection con=BedDao.getConnection();
		PreparedStatement ps=con.prepareStatement("update corona set name=?,registerdate=? where id=?");
		ps.setString(1, b.getName());
		ps.setString(2, b.getRegisterdate());
		ps.setString(3,b.getId());
		status=ps.executeUpdate();
	}
	catch(Exception ae)
	{
		ae.printStackTrace();
	}
	return status;
}

public static int delete(String id)
{
	int status=0;
	try
	{
		Connection con=BedDao.getConnection();
		PreparedStatement ps=con.prepareStatement("delete from corona where id=?");
		ps.setString(1,id);
		status=ps.executeUpdate();
	}
	catch(Exception ae)
	{
		ae.printStackTrace();
	}
	return status;
}

public static Bed getEmployeeById(String id)
{
	Bed b=new Bed();
	try
	{
		Connection con=BedDao.getConnection();
		PreparedStatement ps=con.prepareStatement("select * from corona where id=?");
		ps.setString(1,id);
		ResultSet rs=ps.executeQuery();
		if(rs.next())
		{
			b.setId(rs.getString(1));
			b.setName(rs.getString(2));
			b.setRegisterdate(rs.getString(3));
			
				}
	}
	catch(Exception ae)
	{
		ae.printStackTrace();
	}
	return b;
}
public static List<Bed> getAllEmployees()
{
	List<Bed> list=new ArrayList<Bed>();
	try
	{
		Connection con=BedDao.getConnection();
		PreparedStatement ps=con.prepareStatement("select * from corona");
			ResultSet rs=ps.executeQuery();
		while(rs.next())
		{
			Bed b=new Bed();
			b.setId(rs.getString(1));
			b.setName(rs.getString(2));
			b.setRegisterdate(rs.getString(3));
			list.add(b);
				}
	}
	catch(Exception ae)
	{
		ae.printStackTrace();
	}
	return list;
}
}
