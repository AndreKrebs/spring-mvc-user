<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page import="java.util.Date" %>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<!-- Static content -->
<link rel="stylesheet" href="/resources/css/style.css">

<title>Spring Boot</title>
</head>
<body>
	<h1>Lista de Usuários</h1>

	<fieldset>
    <legend>Filtro:</legend>
		<form:form method="POST">
			Login: <input type="text" name="username" value="${username}"/>
			Nome: <input type="text" name="name" value="${name}"/>
			E-mail: <input type="text" name="email" value="${email}"/> 
			<button type="submit" >Filtrar</button>	
		</form:form>
	</fieldset>	
	
	<br />
	
	<c:if test="${not empty userList}">
		<table>
			<thead>
				<tr>
					<td>ID</td>
					<td>Nome</td>
					<td>Sobrenome</td>
					<td>Login</td>
					<td>E-mail</td>
					<td>Senha</td>
					<td>Data Registro</td>
					<td>Telefone</td>
					<td>Ativo</td>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${userList}" var="userList">
					<tr>
						<td>${userList.getId()}</td>
						<td>${userList.getName()}</td>
						<td>${userList.getSurname()}</td>
						<td>${userList.getUsername()}</td>
						<td>${userList.getEmail()}</td>
						<td>${userList.getPassword()}</td>
						<td>${userList.getRegisterDateBR()}</td>
						<td>${userList.getPhone()}</td>
						<td>${userList.getIs_enabled()==true ? "Sim":"Não"}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</c:if>
</body>
</html>