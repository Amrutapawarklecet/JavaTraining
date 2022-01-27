//create table maremps123(name varchar2(30),address varchar2(30),email varchar2(30),
//phoneno varchar2(30),doj varchar2(30),projname varchar2(30))

package com.javatpoint;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.sql.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class HelloWorldController {

	@RequestMapping("/emp") // input
	public ModelAndView Registration(HttpServletRequest req,HttpServletResponse res)
	{   
		String name = req.getParameter("t1");
		String add = req.getParameter("t2");
		String email = req.getParameter("t3");
		String phno = req.getParameter("t4");
		String doj = req.getParameter("t5");
		String proj = req.getParameter("t6");
		PreparedStatement st = null;
		Connection con = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "System", "1234");
		} catch (Exception ae) {
			ae.printStackTrace();
		}
		String x = req.getParameter("t7");
		if (x.equals("Insert")) {
			try {
				st = con.prepareStatement("insert into maremps123 values(?,?,?,?,?,?)");
				st.setString(1, name);
				st.setString(2, add);
				st.setString(3, email);
				st.setString(4, phno);
				st.setString(5, doj);
				st.setString(6, proj);
				st.execute();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return new ModelAndView("hellopage", "message", "Row Inserted");
			}
		else if (x.equals("Update")) {
			try {
				st = con.prepareStatement(
						"update maremps123 set address=?,email=?,phoneno=?,doj=?,projname=? where name=?");
				st.setString(1, add);
				st.setString(2, email);
				st.setString(3, phno);
				st.setString(4, doj);
				st.setString(5, proj);
				st.setString(6, name);
				st.execute();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return new ModelAndView("hellopage", "message", "Row Updated");
			}
		else if (x.equals("Select")) {
			try {
				Statement stm = con.createStatement();
				ResultSet rs = stm.executeQuery("select * from maremps123 ");
				while (rs.next()) {
					System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3) + " "
							+ rs.getString(4) + " " + rs.getString(5) + " " + rs.getString(6));

				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return new ModelAndView("hellopage", "message", "Row Selected Successfully");
			}
		else if (x.equals("Delete")) {
			try {
				st = con.prepareStatement("delete from maremps123 where name=?");
				st.setString(1, name);
				st.execute();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return new ModelAndView("hellopage", "message", "Row Deleted");
			}
		return null;
	}

	
		
		}

		
		


