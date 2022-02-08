<%@ page import="java.io.*,java.util.*,java.sql.*"%>  
<%@ page import="javax.servlet.http.*,javax.servlet.*" %>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>  
  
<html>  
<head>  
<title>sql:query Tag</title>  
</head>  
<body>  
   <h1><center>Employee DataBase</center></h1><hr>
<sql:setDataSource var="db" driver="com.mysql.cj.jdbc.Driver"  
     url="jdbc:mysql://localhost:3306/marlabs"  
     user="root"  password="Redmi@123"/>  
  
<sql:query dataSource="${db}" var="rs">  
SELECT * from memployees  
</sql:query>  
   
<table border="2" width="100%">  
<tr>  
<th>EmpName</th>  
<th>Address</th>  
<th>Phone no</th>
<th>Email</th>  
<th>Salary</th>  
<th>Designation</th>
<th>Gender</th>  
<th>Nation</th>  
<th>Hobby</th>
  

</tr>  
<c:forEach var="table" items="${rs.rows}">  
<tr>  
<td><c:out value="${table.NAME}"/></td>  
<td><c:out value="${table.ADDRESS}"/></td>  
<td><c:out value="${table.PHONENO}"/></td>
<td><c:out value="${table.EMAIL}"/></td>  
<td><c:out value="${table.SALARY}"/></td>  
<td><c:out value="${table.DESIGN}"/></td>
<td><c:out value="${table.GENDER}"/></td>  
<td><c:out value="${table.NATIONALITY}"/></td>  
<td><c:out value="${table.HOBBY}"/></td>
  
</tr>  
</c:forEach>  
</table>  
  
</body>  
</html>  