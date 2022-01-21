package com.marlabs.training;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/Session3")
public class Session3 extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		HttpSession ses = req.getSession(false);
		String P2Name = req.getParameter("p2name");
		String P2Price = req.getParameter("p2price");
		ses.setAttribute("ob6", P2Name);// session object stored into the session
		ses.setAttribute("ob7", P2Price);// servlet are stateless to make it stateful we are using session.
		String x = (String) ses.getAttribute("ob");
		String y = (String) ses.getAttribute("ob1");
		String z = (String) ses.getAttribute("ob2");
		String x1 = (String) ses.getAttribute("ob3");
		String y1 = (String) ses.getAttribute("ob4");
		String z1 = (String) ses.getAttribute("ob5");
		String y2 = (String) ses.getAttribute("ob6");
		String z2 = (String) ses.getAttribute("ob7");
		pw.println("<html>");
		pw.println("<body bgcolor=cyan>");
		pw.println("<h2>The Final Bill Of Amazon</h2><hr><br><br>");
		pw.println("Name :" + x);
		pw.println("<br><br>");
		pw.println("Address :" + y);
		pw.println("<br><br>");
		pw.println("Phone no :" + z);
		pw.println("<br><br>");
		pw.println("Email :" + x1);
		pw.println("<br><br>");
		pw.println("Product Name :" + y1);
		pw.println("<br><br>");
		pw.println("Price :" + z1);
		pw.println("<br><br>");
		pw.println("Product Name :" + y2);
		pw.println("<br><br>");
		pw.println("Price :" + z2);
		pw.println("<br><br>");
		pw.println("<br><br>");
		pw.println("Total Bill is  :" + (Integer.parseInt(z1) + Integer.parseInt(z2)));
		pw.println("<br><br>");
		pw.println("Thank you Visit Again...");
	}
}