<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<% String a=request.getParameter("t1");
String b=request.getParameter("t2");
String c=request.getParameter("t3");%>

<%out.println("The Student Id is "+a);
out.println("The Student name is "+b);
out.println("The Student address is "+c);%>
