
import java.io.*;
import java.util.List;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/ViewBed")
public class ViewBed extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		pw.println("<body style='background-color:#9FE2BF;'>");
		pw.println("<a href='Bavilability.html'>Book Bed</a>");
		pw.print("<h1><center>Bed Booking Details</center></h1>");
		List<Bed> list = BedDao.getAllEmployees();
		pw.println("<table border='1' width=100%");
		pw.println("<tr><th>ID</th><th>Name</th><th>DATE</th><th>Edit</th><th>Delete</th></tr>");
		for (Bed b : list) {
			pw.println("<tr><td>"+b.getId()+"</td><td>"+b.getName()+"</td><td>"+b.getRegisterdate()+"</td><td><a href='EditBed?id="+b.getId()+"'>Edit</a></td><td><a href='DeleteBed?id="+b.getId()+"'>Delete</a></td></tr>");	
		}
		pw.println("</table>");
		pw.println("<br><br>");
		pw.println("<a href='Bavilability.html'><input type='submit' value='BACK'></a>");
	}
	}