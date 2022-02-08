<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<body>
<h2>The data are</h2>
Data is :${list}
<hr>
<table border="1">
<tr>
<th>BOOK ID</th>
<th>Book NAME</th>
<th>Author</th>
<th>Price</th>
</tr>
<c:forEach items="${list}" var="ob">
<tr>
<td>${ob.bookid }</td>
<td>${ob.bookname }</td>
<td>${ob.author }</td>
<td>${ob.price }</td>
</tr>
</c:forEach>
</table>
</body>
</html>