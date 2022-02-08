package com.marlabs.training;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Autowired
	private HttpServletResponse res;
	private HttpServletResponse req;

	@GetMapping("/show")
	public String showLogin() {
		return "login";
	}

	@GetMapping("/show1")
	public String showRegister() {
		return "register";
	}

	@RequestMapping("/register")
	public String doRegistraion(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		String a = req.getParameter("t1");
		String b = req.getParameter("t2");
		String c = req.getParameter("t3");
		String d = req.getParameter("t4");
		String e = req.getParameter("t5");
		String f = req.getParameter("t6");
		String g =req.getParameter("t7");
		
		if(g.equals("Insert")) {
		String sql = "insert into employee2 values(?,?,?,?,?,?)";
		int count = jdbcTemplate.update(sql, a, b, c, d, e, f);
		System.out.println("Row Inserted");
		return "success1";
	}
		else if(g.equals("Update")) {
	String sql = "update employee2 set phoneno=?,email=?,address=?,salary=?, designation=? where name=?";
		int count = jdbcTemplate.update(sql, b, c, d, e, f,a);
		System.out.println("Row Update");
		return "success2";
	}
		else {
		String sql = "delete from employee2 where name=?";
		int count = jdbcTemplate.update(sql, a);
		System.out.println("Row Delete");
		return "success3";
	}

}
}
