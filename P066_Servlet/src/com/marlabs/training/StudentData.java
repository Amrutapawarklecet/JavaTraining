package com.marlabs.training;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/StudentData")
public class StudentData extends GenericServlet {
	public void init() {
		System.out.println("init");
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		res.setContentType("student/html");
		PrintWriter pw = res.getWriter();
		String a = req.getParameter("t1");
		String b = req.getParameter("t2");
		String c = req.getParameter("t3");
		pw.println("The StudentID is :" + a);
		pw.println("<br>");
		pw.println("The Student Name is :" + b);
		pw.println("<br>");
		pw.println("The Student Address is :" + c);
	}

	public void destroy() {
		System.out.println("Destroy");
	}
}