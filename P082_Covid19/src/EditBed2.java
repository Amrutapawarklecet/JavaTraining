import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
@WebServlet("/EditBed2")
public class EditBed2 extends HttpServlet {
public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
{
res.setContentType("text/html");
PrintWriter pw=res.getWriter();

String id=req.getParameter("id");
String name=req.getParameter("name");
String registerdate=req.getParameter("registerdate");


Bed b=new Bed();
b.setId(id);

b.setName(name);
b.setRegisterdate(registerdate);


int status=BedDao.update(b);
if(status>0)
{
res.sendRedirect("ViewBed");
}
else
{
pw.println("Sorry not updated");
}

}
}