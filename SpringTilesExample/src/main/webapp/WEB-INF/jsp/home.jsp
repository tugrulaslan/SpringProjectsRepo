<%--
  Created by IntelliJ IDEA.
  User: Tugrul
  Date: 21.02.2014
  Time: 14:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<html>
<head>
    <title>Home Page</title>
</head>
<body>
<tiles:insertDefinition name="defaultTemplate">
    <tiles:putAttribute name="body">
        <div class="body">
            <h1>Home page</h1>

            <div class="alert alert-info">This page contains Homepage data</div>
        </div>


    </tiles:putAttribute>
</tiles:insertDefinition>
</body>
</html>
