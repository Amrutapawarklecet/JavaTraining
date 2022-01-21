
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/DeleteBed")
public class DeleteBed extends HttpServlet
{
public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
{
String sid=req.getParameter("id");
//int id=Integer.parseInt(sid);
BedDao.delete(sid);
res.sendRedirect("ViewBed");
}
}



