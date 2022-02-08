<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<body>
<h2>The data are</h2>
Data is :${emps}
<hr>
<table border="1">
<tr>
<th>ID</th>
<th>NAME</th>
<th>SALARY</th>
</tr>
<c:forEach items="${emps}" var="ob">
<tr>
<td>${ob.empid }</td>
<td>${ob.empName }</td>
<td>${ob.empSal }</td>
</tr>
</c:forEach>
</table>
</body>
</html>
