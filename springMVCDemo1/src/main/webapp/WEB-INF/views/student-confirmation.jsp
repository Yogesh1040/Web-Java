<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Student Register Successfully</h1>
<h3>First Name : ${theStudent.firstName}</h3>
<h3>Last Name : ${theStudent.lastName}</h3>
<h3>Country : ${theStudent.country}</h3>
<h3>Favourite Language : ${theStudent.favouriteLanguage}</h3>
<h3>Operating System : </h3>
<ol>
<c:forEach var="temp" items="${theStudent.operatingSystem}">
<h3><li>${temp}</li></h3>
</c:forEach>
</ol>
</body>
</html>