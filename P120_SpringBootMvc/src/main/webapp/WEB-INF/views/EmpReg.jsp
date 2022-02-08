<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<h2>Employee Registration Page</h2>
<form action="save" method="post">
<table>
<tr><td>ID:<td><input type=text name="empid"></tr>
<tr><td>Name:<td><input type=text name="empName"></tr>
<tr><td>Salary:<td><input type=text name="empSal"></tr>
<tr><td>Gender<td>
<input type=radio name=empGen value="male">Male
<input type=radio name=empGen value="female">Female</tr>
<tr><td>Project<td>
<select name=empProj>
<option value="">Select</option>
<option value="Sonar">Sonar</option>
<option value="Java">Java</option>
<option value="springboot">SpringBoot</option>
</select></tr>
<tr><td>Address<td>
<textarea name="empAddr"></textarea></tr>
<tr><td>Language<td>
<input type="checkbox" name=empLang value="English"/>English
<input type="checkbox" name=empLang value="Hindi"/>Hindi
<input type="checkbox" name=empLang value="Panjabi"/>Panjabi
<input type="checkbox" name=empLang value="Urdu"/>Urdu</tr>

<tr><td>Date of Join<td><input type="date" name=empDoj></tr>

<tr><td>Branch<td>
<select name=empBranch>
<option value="">Select</option>
<option value="Bangalore">Bangalore</option>
<option value="Kolkota">Kolkota</option>
<option value="Mysore">Mysore</option>
</select></tr>
<tr><td><td><input type=submit value=submit></tr>
</table>

</html>