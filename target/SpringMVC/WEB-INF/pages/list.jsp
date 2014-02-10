<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>My account</title>
</head>
<body>
<h1>Personnal informations</h1>
<p>Here you can see your informations and edit them.</p>

<table border="1px" cellpadding="0" cellspacing="0">
<thead>
<tr>
<th width="15%">name</th><th width="10%">email</th><th width="10%">actions</th>
</tr>
</thead>
<tbody>
<tr>
<c:forEach var="Biker" items="${Bikers}">
	<td>${Biker.name}</td>
	<td>${Biker.email}</td>
</c:forEach>
</tr>

</tbody>
</table>

<p><a href="${pageContext.request.contextPath}/home.html">Home page</a></p>
</body>
</html>