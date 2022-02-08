//create table marlabemployees(name varchar2(30),address varchar2(30),phoneno varchar2(30),email varchar2(30),
//salary varchar2(30),design varchar2(30),gender varchar2(30),nationality varchar2(30),hobby varchar2(30));

package com.example.demo;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController
{
	@Autowired
	private JdbcTemplate jt;

	@GetMapping("/log")
	public String showLogin()
	{
		return "login";
	}
	
	@GetMapping("/reg")
	public String showRegister()
	{
		return "register";
	}
	
	@RequestMapping("/save")
	public String doRegistration(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		String button=req.getParameter("t10");
		if(button.equals("Insert"))
		{
		String a=req.getParameter("t1");
		String b=req.getParameter("t2");
		String c=req.getParameter("t3");
		String d=req.getParameter("t4");
		String e=req.getParameter("t5");
		String f=req.getParameter("t6");
		String g=req.getParameter("t7");
		String h=req.getParameter("t8");
		String i=req.getParameter("t9");
		
		String sql="insert into memployees values(?,?,?,?,?,?,?,?,?)";
		jt.update(sql,a,b,c,d,e,f,g,h,i);
		System.out.println("row inserted");
						}
		else if(button.equals("Update"))
		{
		String a=req.getParameter("t1");
		String b=req.getParameter("t2");
		String c=req.getParameter("t3");
		String d=req.getParameter("t4");
		String e=req.getParameter("t5");
		String f=req.getParameter("t6");
		String g=req.getParameter("t7");
		String h=req.getParameter("t8");
		String i=req.getParameter("t9");
		
		String sql="update memployees set address=?,phoneno=?,email=?,salary=?,design=?,gender=?,nationality=?,hobby=? where name=?";
		jt.update(sql,b,c,d,e,f,g,h,i,a);
		System.out.println("row updated");
	  			}
		else
		{
		String a=req.getParameter("t1");
				
		String sql="delete from memployees where name=? ";
		jt.update(sql,a);
		System.out.println("row deleted");
					}
		return "success";
	}
}
