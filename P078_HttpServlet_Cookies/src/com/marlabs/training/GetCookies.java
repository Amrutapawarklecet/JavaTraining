package com.marlabs.training;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/GetCookies")
public class GetCookies extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		pw.println("<html>");
		pw.println("<h1>The Cookies Stored are</h1>");
		Cookie ck[] = req.getCookies();
		for (int i = 0; i < ck.length; i++) {
			String key = ck[i].getName();
			String Value = ck[i].getValue();
			pw.println("the cookie key :" + key);
			pw.println("<br><br>");
			pw.println("the cookie value :" + Value);
			pw.println("<br><br>");

		}
		pw.println("</html>");

	}
}