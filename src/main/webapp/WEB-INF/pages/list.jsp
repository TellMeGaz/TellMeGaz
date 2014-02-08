<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>List of Bikers</h1>
<p>Here you can see the list of the Bikers, edit them, remove or update.</p>

<table border="1px" cellpadding="0" cellspacing="0">
<thead>
<tr>
<th width="10%">id</th><th width="15%">name</th><th width="10%">rating</th><th width="10%">actions</th>
</tr>
</thead>
<tbody>
<c:forEach var="Biker" items="${Bikers}">
<tr>
	<td>${Biker.id}</td>
	<td>${Biker.name}</td>
	<td>${Biker.rating}</td>
	<td>
	<a href="${pageContext.request.contextPath}/biker/delete/${Biker.id}.html">Delete</a><br>
	</td>
</c:forEach>
	
</tr>

</tbody>
</table>

<p><a href="${pageContext.request.contextPath}/index.html">Home page</a></p>
</body>
</html>