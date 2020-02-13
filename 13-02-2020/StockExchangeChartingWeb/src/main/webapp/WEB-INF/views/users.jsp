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
	<c:url var="userUrl" value="/user/save" />
	<form:form action="${userUrl}" modelAttribute="user">
		<table>
			<c:if test="${!empty user.username }">
				<tr>
					<td><form:label path="id">Id</form:label></td>
					<td><form:input path="id" readonly="true" disabled="true" /></td>
					<td><form:hidden path="id" /></td>
				</tr>
			</c:if>
			<tr>
				<td><form:label path="username">Username</form:label></td>
				<td><form:input path="username" /></td>
			</tr>
			<tr>
				<td><form:label path="password1">Password1</form:label></td>
				<td><form:input path="password1" /></td>
			</tr>
			<tr>
				<td><form:label path="password2">Password2</form:label></td>
				<td><form:input path="password2" /></td>
			</tr>
			<tr>
				<td><form:label path="email">Email</form:label></td>
				<td><form:input path="email" /></td>
			</tr>
			<tr>
				<td><form:label path="phone">Phone</form:label></td>
				<td><form:input path="phone" /></td>

			</tr>

			<tr>
				<td><form:label path="enabled">Enabled</form:label></td>
				<td><form:input path="enabled" /></td>
			</tr>
			<tr>
				<td></td>
				<td><c:if test="${empty user.username }">
						<input type="submit" value="Register">
					</c:if> <c:if test="${!empty user.username }">
						<input type="submit" value="Update">
					</c:if></td>
			</tr>

		</table>
	</form:form>
	<br />
	<br />
	<div>
		<h2>User Details</h2>
		<table border="1">
			<tr>
				<th>id</th>
				<th>username</th>
				<th>password1</th>
				<th>password2</th>
				<th>email</th>
				<th>phone</th>
				<th>enable</th>
				<th>Actions</th>
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
					<td><a href="<c:url value='/remove/${user.id}'  />">Remove</a>|
						<a href="<c:url value='/update/${user.id}'  />">Update</a></td>
				</tr>
			</c:forEach>
		</table>
	</div>

</body>
</html>