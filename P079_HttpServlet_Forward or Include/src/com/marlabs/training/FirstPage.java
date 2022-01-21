package com.marlabs.training;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/FirstPage")
public class FirstPage extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		RequestDispatcher rd = req.getRequestDispatcher("SecondPage");
		rd.forward(req, res);
		
		/*	PrintWriter pw=res.getWriter();
	res.setContentType("text/html");
	pw.println("<h1>This is include Example</h1>");
	pw.println("<br>");
	RequestDispatcher rd=req.getRequestDispatcher("SecondPage");
	rd.include(req, res);
*/
	}

}
