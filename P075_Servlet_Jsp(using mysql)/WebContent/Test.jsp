<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.*"%>

<%
	String a = request.getParameter("t1");
	String b = request.getParameter("t2");
	String c = request.getParameter("t3");
	PreparedStatement ps = null;
	Statement st = null;
%>
<h1>
	<center>Student Details</center>
</h1>
<hr color=red>
<hr color=blue>
<%
	out.println("The Student Id is " + a);
%>
<br>
<%
	out.println("The Student name is " + b);
	out.println("<br>");
	out.println("The Student address is " + c);
%>
<%
	try {
		String driverclass = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/marlabs";
		String username = "root";
		String password = "Redmi@123";
		Class.forName(driverclass);
		Connection con = DriverManager.getConnection(url, username, password);
		String x = request.getParameter("b1");
		if (x.equals("Insert")) {
			try {
				ps = con.prepareStatement("insert into student values(?,?,?)");
				ps.setInt(1, Integer.parseInt(a));
				ps.setString(2, b);
				ps.setString(3, c);
				ps.execute();
				System.out.println("row inserted");
			} catch (SQLException e) {

				e.printStackTrace();
			}
		} else if (x.equals("Update")) {
			try {
				ps = con.prepareStatement("update student set name=?,address=? where id=?");
				ps.setString(1, b);
				ps.setString(2, c);
				ps.setInt(3, Integer.parseInt(a));
				ps.execute();
				System.out.println("row updated");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} else if (x.equals("Delete")) {
			try {
				ps = con.prepareStatement("delete from student where id=?");
				ps.setInt(1, Integer.parseInt(a));
				ps.execute();
				System.out.println("row deleted");
			} catch (SQLException e) {

				e.printStackTrace();
			}

		} else if (x.equals("Select")) {
			try {
				out.println("<h2>Student Details<h2>");
				out.println("<br><table cellspacing='0' cellpadding='5' border='1'>");
				out.println("<tr><td><b>Student id<td><b>Student name<td><b>Address</tr></b>");
				 ps = con.prepareStatement("select * from student order by id");
				ResultSet rs = ps.executeQuery();
				while (rs.next()) {
					out.println("<tr><td>" + rs.getString(1) + "</td>");
					out.println("<td>" + rs.getString(2) + "</td>");
					out.println("<td>" + rs.getString(3) + "</td></tr>");
				}

			} catch (SQLException e) {

				e.printStackTrace();
			}

		}
	} catch (Exception ae) {
		ae.printStackTrace();
	}
%>