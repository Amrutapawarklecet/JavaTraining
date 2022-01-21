package com.marlabs.training;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/EditServlet")
public class EditServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		pw.println("<h1>Update Employee</h1><hr>");
		String sid = req.getParameter("id");
		int id = Integer.parseInt(sid);
		Emp e = EmpDao.getEmployeeById(id);
		pw.println("<form action='EditServlet2' method=get>");
		pw.println("<table>");
		pw.println("<tr><td>ID: <td><input type=text name=id size=20 value=" + e.getId() + "></tr>");
		pw.println("<tr><td>Name: <td><input type=text name=name size=20 value=" + e.getName() + "></tr>");
		pw.println(
				"<tr><td>Password: <td><input type=password name=password size=20 value=" + e.getPassword() + "></tr>");
		pw.println("<tr><td>Email: <td><input type=email name=email size=20 value=" + e.getEmail() + "></tr>");
		pw.println("<tr><td>PhoneNo: <td><input type=number name=phoneno size=20 value=" + e.getPhoneno() + "></tr>");
		pw.println("<tr><td>ProjectName: <td><input type=text name=projectname size=20 value=" + e.getProjectname() + "></tr>");
		pw.println("<tr><td>Country: <td><select name=country>");
		pw.println("<option>India</option>");
		pw.println("<option>USA</option>");
		pw.println("<option>UK</option>");
		pw.println("<option>Others</option></tr>");
		pw.println("<tr><td><input type=submit value='Save'></td></tr></table></form>");
	}
}