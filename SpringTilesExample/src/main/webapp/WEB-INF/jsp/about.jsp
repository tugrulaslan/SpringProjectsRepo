<%--
  Created by IntelliJ IDEA.
  User: Tugrul
  Date: 21.02.2014
  Time: 13:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<html>
<head>
    <title>About Page</title>
</head>
<body>
<tiles:insertDefinition name="defaultTemplate">
    <tiles:putAttribute name="body">
        <div class="body">
            <ol class="breadcrumb">
                <li><a href="/home">Index</a></li>
                <li class="active">About</li>
            </ol>
            <h1>About page</h1>

            <div class="alert alert-info">This page contains about page data</div>
        </div>
    </tiles:putAttribute>
</tiles:insertDefinition>
</body>
</html>
