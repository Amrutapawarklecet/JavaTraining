<%@ page import="java.io.*,java.util.*,java.sql.*,javax.servlet.http.*,javax.servlet.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>   
<body style="background-color:#87CEEB;">
<sql:setDataSource var="db" driver="com.mysql.cj.jdbc.Driver"
url="jdbc:mysql://localhost:3306/mvc_project"
user="root" password="Redmi@123"/>
<sql:query dataSource="${db}" var="x">
select * from bed
</sql:query>
<table border=2 width=100%>
<tr><td>NAME</td>
<td>DateOfBirth</td>
<td>EMAIL ID</td>
<td>CONTACT NUMBER</td>
<td>GENDER</td>
<td>CITY</td>
<td>HOSPITAL</td>
<td>BED</td></tr>
<tr>
<c:forEach var="table" items="${x.rows}">
<td><c:out value="${table.name }"/></td>
<td><c:out value="${table.date }"/></td>
<td><c:out value="${table.email }"/></td>
<td><c:out value="${table.phoneno }"/></td>
<td><c:out value="${table.gender }"/></td>
<td><c:out value="${table.city }"/></td>
<td><c:out value="${table.hospital }"/></td>
<td><c:out value="${table.bed }"/></td>
</tr>
</c:forEach>
</table>
</body>

