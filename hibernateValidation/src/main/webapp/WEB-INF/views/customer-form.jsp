<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style type="text/css">
.error{color: red}
</style>

<title>Insert title here</title>
</head>
<body>

<i>Fill Out The Form . Asterisk (*) means required</i>
<br><br>

<form:form action="processForm" modelAttribute="customer">
Enter First Name : <form:input path="firstName"/>
<br><br>

Enter Last Name : <form:input path="lastName"/>
<form:errors path="lastName" cssClass="error"/>
<br><br>

Enter Email Id : <form:input path="email"/>
<form:errors path="email" cssClass="error"/>
<br><br>


<input type="submit" value="Register">

</form:form>

</body>
</html>