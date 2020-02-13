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
			<th>companyName</th>
			<th>city</th>
			<th>state</th>
			<th>pincode</th>
			<th>turnover</th>
			<th>aboutCompany</th>
			<th>stockExchange</th>
			<th>sector</th>
		</tr>
		<c:forEach var="user" items="${list}">
			<tr>
				<td>${user.id}</td>
				<td>${user.companyName}</td>
				<td>${user.city}</td>
				<td>${user.state}</td>
				<td>${user.pincode}</td>
				<td>${user.turnover}</td>
				<td>${user.aboutCompany}</td>
				<td>${user.stockExchange}</td>
				<td>${user.sector}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>