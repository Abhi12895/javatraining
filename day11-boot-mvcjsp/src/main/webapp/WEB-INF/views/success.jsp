<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
   <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <!-- <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>-->
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>success page</title>
</head>
<body>
 <h1> From success page </h1>
 <h2> List of products</h2>
 
 <c:forEach var="product" items="${catalog}">
 
         ${product}
 </c:forEach>
 
</body>
</html>