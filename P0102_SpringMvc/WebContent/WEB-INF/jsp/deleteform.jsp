<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  

		<h1>Delete Employee</h1>
       <form:form method="post" action="delete">  
      	<table >  
        <tr>  
          <td>Id : </td> 
          <td><form:input path="id"  /></td>
         </tr>  
         <tr>  
          <td> </td>  
          <td><input type="submit" value="delete" /></td>  
         </tr>  
        </table>  
       </form:form>  
