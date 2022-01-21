import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;



@WebServlet("/SaveBed")
public class SaveBed extends HttpServlet
{
public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
{
res.setContentType("text/html");
PrintWriter pw=res.getWriter();
String name=req.getParameter("name");
String registerdate=req.getParameter("registerdate");


Bed b=new Bed();

b.setName(name);
b.setRegisterdate(registerdate);;


int status=BedDao.save(b);
if(status>0)
{
pw.println("Record inserted successfully");
req.getRequestDispatcher("Bavilability.html").include(req, res);
}
else
{
pw.println("Sorry not inserted");
}

}
}

