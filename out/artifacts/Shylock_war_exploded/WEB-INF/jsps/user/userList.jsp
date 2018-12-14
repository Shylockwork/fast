<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/12/14
  Time: 10:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>

<style>

</style>


<head>
    <title>show user list</title>
</head>
<body>
<table>
    <tr>
        <td>编号</td>
        <td>名称</td>
        <td>密码</td>
        <td>权限</td>
    </tr>

    <c:forEach items="${users}" var="user">
        <tr>
            <td>${user.uid}</td>
            <td>${user.uname}</td>
            <td>${user.upassword}</td>
            <td>${user.privilege}</td>
        </tr>
    </c:forEach>

</table>

</body>
</html>
