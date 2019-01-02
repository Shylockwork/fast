<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/12/20
  Time: 9:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <script src="http://apps.bdimg.com/libs/jquery/2.1.1/jquery.min.js">
    </script>
</head>
<body>
<form action="${pageContext.request.contextPath}/teacher/teacherSave">
    <p>姓名<input type="text" name="teacherName" value="${teacher.teacherName}"/> <span name="teacherNameError"></span></p>
    <p>工龄<input type="text" name="teacherWorktime" value="${teacher.teacherWorktime}"/><span name="teacherWorktimeError"></span></p>
    <p><input type="submit" value="提交"/></p>
</form>
<c:if test="${errors != null}">
    <c:forEach items="${errors}" var="error" >
        <p>${error.codes[0]}----------${error.defaultMessage}</p>
    </c:forEach>
</c:if>

<script type="text/javascript">
    console.log("${errors}")
    $.each(${errors},function (i,value) {
        console.log(value)
    })
</script>
</body>
</html>
