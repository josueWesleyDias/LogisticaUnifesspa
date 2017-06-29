<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8"/>
		<title>Transportadores</title>
	</head>
<body>
	<div class="list">
		<c:forEach items="${tarefas}" var="tarefa">
			${tarefa.titulo}
		</c:forEach>
	</div>
</body>
</html>