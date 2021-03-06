<%@ page import="java.io.*,java.util.*,java.sql.*"%>  
<%@ page import="javax.servlet.http.*,javax.servlet.*" %>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>  
  
<html>  
<head>  
<title>View the Result</title>  
</head>  
<body>  
   
<sql:setDataSource var="db" driver="oracle.jdbc.driver.OracleDriver"  
     url="jdbc:oracle:thin:@localhost:1521:XE"  
     user="system"  password="1234"/>  
  
<sql:query dataSource="${db}" var="rs">  
SELECT * from employee 
</sql:query>  
   
<table border="2" width="100%">  
<tr>  
<th>EmpID</th>  
<th>First Name</th>  
<th>Salary</th>  
<th>Designation</th>  
</tr>  
<c:forEach var="table" items="${rs.rows}">  
<tr>  
<td><c:out value="${table.id}"/></td>  
<td><c:out value="${table.name}"/></td>  
<td><c:out value="${table.salary}"/></td>  
<td><c:out value="${table.designation}"/></td>  

</tr>  
</c:forEach>  
</table>  
  
</body>  
</html>  