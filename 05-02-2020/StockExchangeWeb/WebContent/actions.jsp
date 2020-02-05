<%@ include file="header.jsp" %>

<jsp:useBean id ="user" class="com.cts.training.bean.LoginBean" scope="page">

</jsp:useBean>
<%-- <jsp:setProperty property="username" name="user" value="admin007" /> 
<<jsp:setProperty property="password" name="user" value="admin#1234" /> --%>
<jsp:setProperty property="*" name="user"/>

<hr>
User details are:<br>
Username: <jsp:getProperty property="username" name="user"/><br />
Password: <jsp:getProperty property="password" name="user"/>

</body>

</html>