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
	<c:url var="companyUrl" value="/company/save" />
	<form:form action="${companyUrl}" modelAttribute="company">
		<table>
			<tr>
				<td><form:label path="companyName">CompanyName</form:label></td>
				<td><form:input path="companyName" /></td>
			</tr>
			<tr>
				<td><form:label path="city">City</form:label></td>
				<td><form:input path="city" /></td>
			</tr>
			<tr>
				<td><form:label path="state">State</form:label></td>
				<td><form:input path="state" /></td>
			</tr>
			<tr>
				<td><form:label path="pincode">Pincode</form:label></td>
				<td><form:input path="pincode" /></td>
			</tr>
			<tr>
				<td><form:label path="turnover">Turnover</form:label></td>
				<td><form:input path="turnover" /></td>

			</tr>

			<tr>
				<td><form:label path="aboutCompany">AboutCompany</form:label></td>
				<td><form:input path="aboutCompany" /></td>
			</tr>
			<tr>
				<td><form:label path="stockExchange">StockExchange</form:label></td>
				<td><form:input path="stockExchange" /></td>
			</tr>
			<tr>
				<td><form:label path="sector">Sector</form:label></td>
				<td><form:input path="sector" /></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Register"></td>
			</tr>

		</table>
	</form:form>
	<br />
	<br />
	<h2>CompanyDetails</h2>
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
			<th>Actions</th>
		</tr>
		<c:forEach var="company" items="${list}">
			<tr>
				<td>${company.id}</td>
				<td>${company.companyName}</td>
				<td>${company.city}</td>
				<td>${company.state}</td>
				<td>${company.pincode}</td>
				<td>${company.turnover}</td>
				<td>${company.aboutCompany}</td>
				<td>${company.stockExchange}</td>
				<td>${company.sector}</td>
				<td><a href="<c:url value='/remove-company/${company.id}'  />">Remove</a>
			</tr>
		</c:forEach>
	</table>
</body>
</html>