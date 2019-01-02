<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/12/20
  Time: 14:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>file down load</title>
</head>
<body>
<c:forEach items="${files}" var="file">
    <p>下载<a href="${pageContext.request.contextPath}/file/fileDownload2?fileName=${file}">${file}</a></p>
</c:forEach>



</body>
</html>
