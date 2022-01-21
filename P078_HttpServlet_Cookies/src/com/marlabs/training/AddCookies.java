package com.marlabs.training;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/AddCookies")
public class AddCookies extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		String key = req.getParameter("name");
		String value = req.getParameter("password");
		Cookie c = new Cookie(key, value);
		res.addCookie(c);
		pw.println("The key is :" + key);
		pw.println("<br><br>");
		pw.println("The value is :" + value);
		pw.println("<br><br>");
		pw.println("Cookies Added Successfully");
		pw.close();
	}
}