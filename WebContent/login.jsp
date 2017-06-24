<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8"/>
		<title>Login</title>
	</head>
<body>
	<div align="center">
		<h2>Logistica</h2>
		<h4>Onde você encotra o seu transporte</h4>
	</div>
	<form action="" method="post">
		<div align="center">
			<table>
				<caption>Acesse</caption>
				<tr>
					<th>E-mail: </th>
					<td><input type="email" name="email"/></td>
				</tr>
				<tr>
					<th>Senha: </th>
					<td><input type="password" name="senha" maxlength="10" min="4"/></td>
				</tr>
				<tr>
					<th></th>
					<td>
						<input type="submit" name="enviar" value="Enviar"/>
						<input type="submit" name="cancelar" value="Cancelar" /> <!-- onclick="history.go(-1);" -->
					</td>
				</tr>
			</table>
		</div>
	</form>
</body>
</html>
<jsp:include page="padrao/rodape.jsp"/>