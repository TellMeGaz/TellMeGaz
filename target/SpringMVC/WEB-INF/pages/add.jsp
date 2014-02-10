<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Inscription</title>
</head>
<body>
<h1>Inscription</h1>
<p>Ici tu peux créer ton compte</p>
${message}<br/>
<form:form method="POST" commandName="biker" action="${pageContext.request.contextPath}/biker/add/process.html">
<table>
<tbody>
	<tr>
		<td>Nom:</td>
		<td><form:input path="name"/></td>
	</tr>
	<tr>
		<td>Email:</td>
		<td><form:input path="email"/></td>
	</tr>
	<tr>
		<td>Mot de passe:</td>
		<td><form:input path="password" type="password"/></td>
	</tr>
	<tr>
		<td><input value="S'inscrire" type="submit"/></td>
		<td></td>
	</tr>
</tbody>
</table>
</form:form>
<p><a href="${pageContext.request.contextPath}/">Accueil</a></p>
</body>
</html>