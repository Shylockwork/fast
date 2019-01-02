<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/12/20
  Time: 10:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>file up</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/file/fileUp" method="post" enctype="multipart/form-data">
<p><input type="file" name="file"/></p>
    <p><input type="submit" value="提交"/></p>
</form>
</body>
</html>
