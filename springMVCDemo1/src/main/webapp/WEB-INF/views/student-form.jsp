<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Student Form</h1>
<hr>
<form:form action="studentConfirm" method="post" modelAttribute="theStudent" >
Enter First Name : <form:input path="firstName"/>
<br><br>
Enter Last Name : <form:input path="lastName"/>
<br><br>
Enter Country : <form:select path="country">
<form:options items="${theStudent.countryOption}"/>
</form:select>
<br><br>
Select Favourite Language : 
<form:radiobutton path="favouriteLanguage" value="Java"/>Java
<form:radiobutton path="favouriteLanguage" value="SpringBoot"/>Spring Boot
<form:radiobutton path="favouriteLanguage" value="Microservices"/>Microservices
<br><br>
Select Operating Systems : 
<form:checkbox path="operatingSystem" value="Windows"/>Windows
<form:checkbox path="operatingSystem" value="Linux"/>Linux
<form:checkbox path="operatingSystem" value="MacOs"/>Mac Os
<br><br>
<input type="submit" value="Register" >
</form:form>
</body>
</html>