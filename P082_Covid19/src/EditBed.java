

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EditBed
 */
@WebServlet("/EditBed")
public class EditBed extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
		pw.println("<h1>Update Details</h1><hr>");
		String id=req.getParameter("id");
		//int id=Integer.parseInt(sid);
		Bed b=BedDao.getEmployeeById(id);
		pw.println("<body style='background-color:#9FE2BF;'>");
		pw.println("<form action='EditBed2' method=get>");
		pw.println("<table>");
		pw.println("<tr><td>ID: <td><input type=text name=id size=20 value="+b.getId()+"></tr>");
		pw.println("<tr><td>Name: <td><input type=text name=name size=20 value="+b.getName()+"></tr>");
		pw.println("<tr><td>Regiterdate: <td><input type=text name=registerdate size=20 value="+b.getRegisterdate()+"></tr>");
		
		pw.println("<tr><td><input type=submit value='Save'></td></tr></table></form>");
		pw.println("<br>");
		pw.println("<a href='ViewBed'><input type='submit' value='BACK'></a>");


	}
}
