package com.marlabs.training;
import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
@WebServlet("/Login")
	public class Login extends HttpServlet 
	{
		public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
		{
			PrintWriter pw=res.getWriter();
			res.setContentType("text/html");
			String a=req.getParameter("t1");
			String b=req.getParameter("t2");
			String driverclass="oracle.jdbc.driver.OracleDriver";
			String url="jdbc:oracle:thin:@localhost:1521:xe";
			String username="system";
			String password="1234";
				try
			{
			Class.forName(driverclass);
			Connection con=DriverManager.getConnection(url,username,password);
			PreparedStatement ps=con.prepareStatement("select * from marlabsstud1 where name=? and password=?");
			ps.setString(1,a);
			ps.setString(2,b);
			ResultSet rs=ps.executeQuery();
			int x=0;
			while(rs.next())
			{
				x=1;
			}
			if(x==1)
				res.sendRedirect("Success.html");
			else
			 res.sendRedirect("Login.html");
		}
		catch(Exception ae)
		{
			ae.printStackTrace();
		}
		}
	}
