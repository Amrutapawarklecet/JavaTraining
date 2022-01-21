package com.marlabs.training;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/Session2")
public class Session2 extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		HttpSession ses = req.getSession(false);
		String P1Name = req.getParameter("p1name");
		String P1Price = req.getParameter("p1price");
		ses.setAttribute("ob4", P1Name);// session object
		ses.setAttribute("ob5", P1Price);
		pw.println("<html>");
		pw.println("<body bgcolor=cyan>");
		pw.println("<form action=Session3 method=get>");
		pw.println("Enter the product2 name :");
		pw.println("<input type=text name=p2name  size=20 required>");
		pw.println("<br><br>");
		pw.println("Enter the product2 price :");
		pw.println("<input type=text name=p2price  size=20 required>");
		pw.println("<br><br>");
		pw.println("<input type=submit value=Submit>");
		pw.println("</body>");
		pw.println("</form></html>");
	}
}
