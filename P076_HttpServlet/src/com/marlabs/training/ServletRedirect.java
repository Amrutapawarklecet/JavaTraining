package com.marlabs.training;

import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/ServletRedirect")
public class ServletRedirect extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		String a = req.getParameter("t1");
		String b = req.getParameter("t2");
		String c = req.getParameter("t3");
		String d = req.getParameter("t4");
		String driverclass = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String username = "system";
		String password = "1234";
		//String sql="create table marlabsstud1 (id number,name varchar2(30),address varchar2(30),password varchar2(30))";
		String sql1 = "insert into marlabsstud1 values(?,?,?,?)";
		try {
			Class.forName(driverclass);
			Connection con = DriverManager.getConnection(url, username, password);
			 //PreparedStatement st=con.prepareStatement(sql);
			 //st.execute();
			PreparedStatement st1 = con.prepareStatement(sql1);
			st1.setInt(1, Integer.parseInt(a));
			st1.setString(2, b);
			st1.setString(3, c);
			st1.setString(4, d);
			st1.execute();
			res.sendRedirect("Login.html");
		} catch (Exception ae) {
			ae.printStackTrace();
		}
	}
}
