package com.marlabs.training;

import java.io.*;
import java.util.List;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/ViewServlet")
public class ViewServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		pw.println("<a href='EmployeeReg.html'>Add new Employees</a>");
		pw.print("<h1>Employee List </h1>");
		List<Emp> list = EmpDao.getAllEmployees();
		pw.println("<table border='1' width=100%");
		pw.println(
				"<tr><th>ID</th><th>Name</th><th>Password</th><th>Email</th><th>PhoneNo</th><th>ProjectName</th><th>Country</th><th>Edit</th><th>Delete</th></tr>");
		for (Emp e : list) {
			pw.println("<tr><td>" + e.getId() + "</td><td>" + e.getName() + "</td><td>" + e.getPassword() + "</td><td>"
					+ e.getEmail() + "</td><td>" + e.getPhoneno() + "</td><td>" + e.getProjectname() + "</td><td>" + e.getCountry() + "</td><td><a href='EditServlet?id=" + e.getId()
					+ "'>Edit</a></td><td><a href='DeleteServlet?id=" + e.getId() + "'>Delete</a></td></tr>");
		}
		pw.println("</table>");
	}
}
