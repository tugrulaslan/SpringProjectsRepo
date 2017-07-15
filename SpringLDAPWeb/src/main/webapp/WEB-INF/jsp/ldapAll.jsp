<%--
  Created by IntelliJ IDEA.
  User: Tugrul
  Date: 12.02.2014
  Time: 09:44
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>LDAP DATA</title>
</head>
<body>
<c:if test="${not empty listsLDAP}">
<table border="1px" bordercolor="black" width=80% align="center">
    <tr>
        <td><b>Name</b></td>
        <td><b>Displayname</b></td>
        <td><b>Lastname</b></td>
        <td><b>Firstname</b></td>
        <td><b>Mail</b></td>
        <td><b>User ID</b></td>
    </tr>
    <c:forEach items="${listsLDAP}" var="element">

    <tr>
        <td><c:out value="${element.name}" /></td>
        <td><c:out value="${element.displayName}" /></td>
        <td><c:out value="${element.lastName}" /></td>
        <td><c:out value="${element.firstName}" /></td>
        <td><c:out value="${element.mail}" /></td>
        <td><c:out value="${element.userID}" /></td>
    </tr>

    </c:forEach>
    </c:if>
</body>
</html>
