<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/12/19
  Time: 11:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Goods..Save</title>
</head>
<body>
<form action="${pageContext.request.contextPath }/good/goodsSave.action" method="post">
    <p>名称:<input type="text" name="goodsName" value="${good.goodsName}"></p>
    <p>单价:<input type="text" name="goodsPrice" value="${good.goodsPrice}"></p>
    <p>简介:<textarea rows="10" cols="30" name="goodsIntr">${good.goodsIntr}</textarea>
    <p>生产日期:<input type="text" name="goodsDate" value="${good.goodsDate}"></p>
    <p><input type="submit" value="添加"></p>
</form>

</body>
</html>
