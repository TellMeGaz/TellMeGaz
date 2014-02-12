<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Connexion</title>
</head>
<body>
<h1>Formulaire de Connexion</h1>
${message}
<form:form method="POST"  modelAttribute="biker" action="${pageContext.request.contextPath}/biker/login/process.html">
<table>
<tbody>
	<tr>
		<td>Email:</td>
		<td><form:input path="email"/><form:errors path="email"/></td>
	</tr>
	<tr>
		<td>Mot de passe:</td>
		<td><form:input path="password"/><form:errors path="password"/></td>
	</tr>
	<tr>
		<td><input value="Connexion" type="submit"/></td>
		<td></td>
	</tr>
</tbody>
</table>
</form:form>
</body>
</html>