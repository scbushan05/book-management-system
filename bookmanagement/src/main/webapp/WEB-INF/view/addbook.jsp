<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Add Book</h1>
	<form:form action = "bookprocess" modelAttribute="book">
		<form:hidden path="id"/>
		Book Title: <form:input path="title" /><br/>
		Book Author: <form:input path="author" /><br/>
		<button type = "submit">Add Book</button>
	</form:form>
</body>
</html>