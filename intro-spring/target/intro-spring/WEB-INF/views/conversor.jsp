<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form:form method="POST" modelAttribute="conversor">
		<p>Valor (BRL):  <form:input type="text" path="real" /></p>
		<p>Taxa  (USD):  <form:input type="text" path="taxa" /></p>
		<p><form:button>Enviar</form:button></p>
		<p>${mensagem}</p>
	</form:form>
	
</body>
</html>