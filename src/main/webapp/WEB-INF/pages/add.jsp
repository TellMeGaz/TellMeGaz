<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Add team page</h1>
<p>Here you can add a new biker.</p>
<form:form method="POST" commandName="biker" action="${pageContext.request.contextPath}/biker/add/process.html">
<table>
<tbody>
	<tr>
		<td>Name:</td>
		<td><form:input path="name"/></td>
	</tr>
	<tr>
		<td>Rating:</td>
		<td><form:input path="rating"/></td>
	</tr>
	<tr>
		<td><input value="Add" type="submit"/></td>
		<td></td>
	</tr>
</tbody>
</table>
</form:form>
<p><a href="${pageContext.request.contextPath}/home.html">Home page</a></p>
</body>
</html>