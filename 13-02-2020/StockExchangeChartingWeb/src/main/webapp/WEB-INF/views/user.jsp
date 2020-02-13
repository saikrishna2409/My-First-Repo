<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
		<tr>
			<th>id</th>
			<th>username</th>
			<th>password1</th>
			<th>password2</th>
			<th>email</th>
			<th>phone</th>
			<th>enable</th>
		</tr>
		<c:forEach var="user" items="${list}">
			<tr>
				<td>${user.id}</td>
				<td>${user.username}</td>
				<td>${user.password1}</td>
				<td>${user.password2}</td>
				<td>${user.email}</td>
				<td>${user.phone}</td>
				<td>${user.enabled}</td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>