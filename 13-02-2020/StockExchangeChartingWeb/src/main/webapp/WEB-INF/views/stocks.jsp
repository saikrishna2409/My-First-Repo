<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:url var="stockexchangeUrl" value="/stockexchange/save" />
	<form:form action="${stockexchangeUrl}" modelAttribute="stockexchange">
		<table>
		<c:if test="${!empty stockexchange.name }">
			<tr>
				<td><form:label path="id">StockId</form:label></td>
				<td><form:input path="id"  disabled="true" readonly="true" />
				<form:hidden path="id"/>
				</td>
			</tr>
			</c:if>
			<tr>
				<td><form:label path="name">StockName</form:label></td>
				<td><form:input path="name" /></td>
			</tr>
			<tr>
				<td><form:label path="address">StockAddress</form:label></td>
				<td><form:input path="address" /></td>
			</tr>
			<tr>
				<td><form:label path="remarks">Remarks</form:label></td>
				<td><form:input path="remarks" /></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Register"></td>
			</tr>

		</table>
	</form:form>
	<br />
	<br />
	<h2>StockExchange Details</h2>
	<table border="1">
		<tr>
			<th>stock_id</th>
			<th>stock_name</th>
			<th>stock_address</th>
			<th>stock_remarks</th>
			<th>Actions</th>
		</tr>
		<c:forEach var="stockexchange" items="${stock}">
			<tr>
				<td>${stockexchange.id}</td>
				<td>${stockexchange.name}</td>
				<td>${stockexchange.address}</td>
				<td>${stockexchange.remarks}</td>
				<td><a href="<c:url value='/remove-stockexchange/${stockexchange.id}'  />">Remove</a>|
					 <a href="<c:url value='/update-stockexchange/${stockexchange.id}'  />">Update</a></td>
				</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>