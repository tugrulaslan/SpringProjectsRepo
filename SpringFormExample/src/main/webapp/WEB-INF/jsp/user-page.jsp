<%--
  Created by IntelliJ IDEA.
  User: Tugrul
  Date: 19.02.2014
  Time: 11:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
<head>
    <title>Person Form</title>
</head>
<body>
<form:form method="post" commandName="userCommand" action="addUser.html">
    <table>
        <tbody>
        <tr>
            <td><form:label path="firstName">Firstname: </form:label></td>
            <td><form:input path="firstName" /></td>
        </tr>
        <tr>
            <td><form:label path="lastName">Lastname: </form:label></td>
            <td><form:input path="lastName" /></td>
        </tr>
        <tr>
            <td><form:label path="email">Email: </form:label></td>
            <td><form:input path="email" /></td>
        </tr>
        <tr>
            <td><form:label path="age">Age: </form:label></td>
            <td><form:input path="age" /></td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="Add User" />
            </td>
        </tr>
        </tbody>
    </table>
</form:form>

</body>
</html>
