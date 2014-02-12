<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Mon Garage</title>
</head>
<body>
<h1>Mes informations</h1>
<p>Consultez ou éditez vos informations</p>

<table border="1px" cellpadding="0" cellspacing="0">
<thead>
<tr>
<th width="15%">Nom</th><th width="10%">Email</th><th width="10%">actions</th>
</tr>
</thead>
<tbody>
<tr>
	<td>${biker.name}</td>
	<td>${biker.email}</td>
	<td><a href="${pageContext.request.contextPath}/biker/edit/${biker.id}.html">Modifier</a></td>
</tr>

</tbody>
</table>

<p><a href="${pageContext.request.contextPath}/home.html">Accueil</a></p>
</body>
</html>