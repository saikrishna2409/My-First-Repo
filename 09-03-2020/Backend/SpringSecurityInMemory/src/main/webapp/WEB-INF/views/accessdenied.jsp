<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Access Denied</title>
</head>
<body>
	<h1>Access is Denied</h1>

	<c:choose>
		<c:when test=${empty username}">
			<h2>You are not authorized to access this</h2>
		</c:when>
		<c:otherwise>
			<h2>
				Username: ${username}<br/> You do not have permission to access
				this page!
			</h2>
		</c:otherwise>
	</c:choose>
</body>
</html>