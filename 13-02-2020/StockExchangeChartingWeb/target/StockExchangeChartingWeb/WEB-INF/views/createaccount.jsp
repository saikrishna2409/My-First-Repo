<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
<%@ include file="header.jsp" %>
<div class="container">
	<div class="row m-4">
		<div class="col" style="height: 70vh;">
			<div class="pt-4">
				<div class="card shadow">
					<p class="h4 card-header text-center">CreateAccount</p>
					<div class="card-body bg-light">

						<p class="card-text">Details:&nbsp;</p>
						<c:url var="userUrl" value="/user/save" />
						<form:form action="${userUrl}" modelAttribute="user">
							<table>
								<c:if test="${!empty user.username }">
									<div class="form-group">
									<tr>
										<td><form:label path="id">Id</form:label></td>
										<td><form:input path="id" readonly="true" disabled="true" /></td>
										<td><form:hidden path="id" /></td>
									</tr>
									</div>
								</c:if>
								<div class="form-group">
									<tr>
										<td><form:label path="username">Username</form:label></td>
										<td><form:input path="username" /></td>
									</tr>
								</div>
								<div class="form-group">
									<tr>
										<td><form:label path="password1">Password1</form:label></td>
										<td><form:input path="password1" /></td>
									</tr>
								</div>
								<div class="form-group">
									<tr>
										<td><form:label path="password2">Password2</form:label></td>
										<td><form:input path="password2" /></td>
									</tr>
								</div>
								<div class="form-group">
									<tr>
										<td><form:label path="email">Email</form:label></td>
										<td><form:input path="email" /></td>
									</tr>
								</div>
								<div class="form-group">
									<tr>
										<td><form:label path="phone">Phone</form:label></td>
										<td><form:input path="phone" /></td>

									</tr>
								</div>
								<div class="form-group">
									<tr>
										<td><form:label path="enabled">Enabled</form:label></td>
										<td><form:input path="enabled" /></td>
									</tr>
								</div>
								<div class="row justify-content-center">
									<tr>
										<td></td>
										<td><c:if test="${empty user.username }">
												<input type="submit" value="Register">
											</c:if> <c:if test="${!empty user.username }">
												<input type="submit" value="Update">
											</c:if></td>
									</tr>
								</div>
							</table>
						</form:form>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>

</body>
</html>