package com.marlabs.training;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/SaveServlet")
public class SaveServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		String name = req.getParameter("name");
		String password = req.getParameter("password");
		String email = req.getParameter("email");
		String phoneNo=req.getParameter("phoneno");
		String projectName=req.getParameter("projectname");
		String country = req.getParameter("country");

		Emp e = new Emp();
		e.setPassword(password);
		e.setName(name);
		e.setEmail(email);
		e.setPhoneno(phoneNo);
		e.setProjectname(projectName);
		e.setCountry(country);

		int status = EmpDao.save(e);
		if (status > 0) {
			pw.println("Record inserted successfully");
			req.getRequestDispatcher("EmployeeReg.html").include(req, res);
		} else {
			pw.println("Sorry not inserted");
		}

	}
}
