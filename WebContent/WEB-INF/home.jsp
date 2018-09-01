<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>Home</title>
    </head>
    <body>
      
        <p>Calculator</p>
        
      <c:if test="${ !empty first and !empty second and !empty action and !empty result}">
      	<p><c:out value=" ${ first } ${ action } ${ second } =  ${ result }" /></p>
      </c:if>
        
      
        <form method="post" action="home"  >
        	<input type="text" name="first" value="" >
        	<select name="action">
        		<option>+</option>
        		<option>-</option>
        		<option>*</option>
        		<option>/</option>
        	</select>
        	<input type="text" name="second" value="" >
        	<input type="submit" value="Submit" >
        </form>
    </body>
</html>