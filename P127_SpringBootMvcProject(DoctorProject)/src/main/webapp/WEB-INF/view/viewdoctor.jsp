<%@ page import="java.io.*,java.util.*,java.sql.*,javax.servlet.http.*,javax.servlet.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>   
<body style="background-color:#87CEEB;">
<sql:setDataSource var="db" driver="com.mysql.cj.jdbc.Driver"
url="jdbc:mysql://localhost:3306/mvc_project"
user="root" password="Redmi@123"/>
<sql:query dataSource="${db}" var="x">
select * from doctor
</sql:query>
<table border=2 width=100%>
<tr><td>NAME</td></tr>
<tr>
<c:forEach var="table" items="${x.rows}">
<td><c:out value="${table.name }"/></td>
</tr>
</c:forEach>
</table> </body>

