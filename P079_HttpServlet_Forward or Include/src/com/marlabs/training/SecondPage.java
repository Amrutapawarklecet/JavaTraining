package com.marlabs.training;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/SecondPage")
public class SecondPage extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) {
		try {
			PrintWriter pw = res.getWriter();
			res.setContentType("text/html");
			String Name = req.getParameter("name");
			String Address = req.getParameter("address");
			String PhoneNo = req.getParameter("phoneno");
			String Email = req.getParameter("email");
			pw.println("The name is :" + Name);
			pw.println("<br><br>");
			pw.println("The address is :" + Address);
			pw.println("<br><br>");
			pw.println("The phone no is :" + PhoneNo);
			pw.println("<br><br>");
			pw.println("The email is :" + Email);
			pw.println("<br><br>");
		} catch (Exception ae) {
			ae.printStackTrace();
		}
	}
}
