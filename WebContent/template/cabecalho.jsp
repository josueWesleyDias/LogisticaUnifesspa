<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" type="text/css" href="model/css/bootstrap-theme.min.css.map">
	<meta charset="utf-8"/>
	<title><% %></title>
</head>
<body>
	<div align="right">
		<%-- <c:if test="${ !session.logado }"> --%>
			<input type="submit" name="login" value="Login" onclick="window.location.href='login.jsp'">
			<input type="submit" name="cadastro" value="Cadastre-se" onclick="window.location.href='cadastro.jsp'">
		<%-- </c:if> --%>
		<%-- <c:otherwise>
    		Bem vindo(a) <c:out value="${ !session.logado.nome }"/>
  		</c:otherwise> --%>
	</div>
	<div align="center">
		<h2>Logistica</h2>
		<h4>Onde você encotra o seu transporte</h4>
	</div>
	<br/><br/>
</body>
