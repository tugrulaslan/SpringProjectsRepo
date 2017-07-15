<%--
  Created by IntelliJ IDEA.
  User: Tugrul
  Date: 19.02.2014
  Time: 11:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Person List</title>
</head>
<body>
<h1>User List</h1>
<c:if test="${not empty users}">
    <table border="1">
        <tr>
            <td>Firstname</td>
            <td>Lastname</td>
            <td>Email</td>
            <td>Age</td>
        </tr>
        <c:forEach var="element" items="${users}">
            <tr>
                <td>${element.firstName}</td>
                <td>${element.lastName}</td>
                <td>${element.email}</td>
                <td>${element.age}</td>
            </tr>
        </c:forEach>
    </table>
</c:if>
<a href="/">Index</a><br />
</body>
</html>

