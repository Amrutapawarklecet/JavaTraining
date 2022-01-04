package com.marlabs.training;

import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/StudentData")
public class StudentData extends GenericServlet {
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		Connection con = null;
		res.setContentType("student/html");
		PrintWriter pw = res.getWriter();
		String a = req.getParameter("t1");
		String b = req.getParameter("t2");
		String c = req.getParameter("t3");
		pw.println("The StudentID is :" + a);
		pw.println("<br>");
		pw.println("The Student Name is :" + b);
		pw.println("<br>");
		pw.println("The Student Address is :" + c);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/marlabs", "root", "Redmi@123");
		} catch (Exception ae) {
			ae.printStackTrace();
		}
		String x = req.getParameter("b1");
		PreparedStatement st;
		if (x.equals("Insert")) {
			try {
				st = con.prepareStatement("insert into student values(?,?,?)");
				st.setInt(1, Integer.parseInt(a));
				st.setString(2, b);
				st.setString(3, c);
				st.execute();
				System.out.println("row inserted");
			} catch (SQLException e) {

				e.printStackTrace();
			}
		} else if (x.equals("Update")) {
			try {
				st = con.prepareStatement("update student set name=?,address=? where id=?");
				st.setString(1, b);
				st.setString(2, c);
				st.setInt(3, Integer.parseInt(a));
				st.execute();
				System.out.println("row updated");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} else if (x.equals("Delete")) {
			try {
				st = con.prepareStatement("delete from student where id=?");
				st.setInt(1, Integer.parseInt(a));
				st.execute();
				System.out.println("row deleted");
			} catch (SQLException e) {

				e.printStackTrace();
			}

		} else if (x.equals("Select")) {
			try {
				Statement st2 = con.createStatement();
				ResultSet rs = st2.executeQuery("select * from student");
				while (rs.next()) {
					System.out.println(rs.getInt(1) + "   " + rs.getString(2) + "  " + rs.getString(3));
				}

			} catch (SQLException e) {

				e.printStackTrace();
			}

		}

	}
}
