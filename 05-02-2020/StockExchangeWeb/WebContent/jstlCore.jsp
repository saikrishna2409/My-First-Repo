<%@ include file="header.jsp" %>
<c:out value ="Hello World"/>
<br />
<c:set var="name" value="krishna" />
<c:out value="${name }" />
<c:remove  var="name" />
<br />
Name :<c:out value="${name }" />
<br />
Loop with array: <br />
<!--   <c:forEach var="i" begin="1" end="10" step="1"/>-->
<%-- <c:forEach var="i" items="1,21,23,43,98,90">
<h2>${i }</h2>
</c:forEach> --%>
<c:set var="income" scope="session" value="${4000*4}"/>  
<c:if test="${income > 8000}">  
   <p>My income is: <c:out value="${income}"/><p>  
</c:if>  

</body>
</html>