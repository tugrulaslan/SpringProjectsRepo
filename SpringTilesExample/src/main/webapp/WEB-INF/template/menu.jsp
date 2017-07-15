<%--
  Created by IntelliJ IDEA.
  User: Tugrul
  Date: 21.02.2014
  Time: 13:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <body>
    <div class="menu">
        <ul>
            <spring:url value="/home" var="homeUrl" htmlEscape="true"/>
            <li><a href="${homeUrl}">Index</a></li>
            <spring:url value="/about" var="aboutUrl" htmlEscape="true"/>
            <li><a href="${aboutUrl}">About</a></li>
            <spring:url value="/sitemap" var="sitemapUrl" htmlEscape="true"/>
            <li><a href="${sitemapUrl}">Site Map</a></li>
            <spring:url value="/login" var="loginUrl" htmlEscape="true"/>
            <li><a href="${loginUrl}">Log in</a></li>
        </ul>
    </div>
    </body>
</head>
</html>
