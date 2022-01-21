package com.marlabs.training;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/Session1")
public class Session1 extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		HttpSession ses = req.getSession(true);
		String Name = req.getParameter("name");
		String Address = req.getParameter("address");
		String PhoneNo = req.getParameter("phoneno");
		String Email = req.getParameter("email");
		ses.setAttribute("ob", Name);
		ses.setAttribute("ob1", Address);
		ses.setAttribute("ob2", PhoneNo);
		ses.setAttribute("ob3", Email);
		pw.println("<html>");
		pw.println("<body bgcolor=cyan>");
		pw.println("<form action=Session2 method=get>");
		pw.println("Enter the product1 name :");
		pw.println("<input type=text name=p1name  size=20 required>");
		pw.println("<br><br>");
		pw.println("Enter the product1 price :");
		pw.println("<input type=text name=p1price  size=20 required>");
		pw.println("<br><br>");
		pw.println("<input type=submit value=Submit>");
		pw.println("</body>");
		pw.println("</form></html>");
	}
}