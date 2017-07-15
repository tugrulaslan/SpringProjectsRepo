<%--
  Created by IntelliJ IDEA.
  User: Tugrul
  Date: 24.02.2014
  Time: 16:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>

<html>
<head>
    <title>Log in</title>
</head>
<body>
<tiles:insertDefinition name="defaultTemplate">
    <tiles:putAttribute name="body">
        <div class="body">
            <div class="container">
                <form class="form-signin" role="form">
                    <h2 class="form-signin-heading">Please sign in</h2>
                    <input type="email" class="form-control" placeholder="Email address" required autofocus>
                    <input type="password" class="form-control" placeholder="Password" required>
                    <label class="checkbox">
                        <input type="checkbox" value="remember-me"> Remember me
                    </label>
                    <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
                </form>

            </div>
        </div>
    </tiles:putAttribute>
</tiles:insertDefinition>
</body>
</html>
