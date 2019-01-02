<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/7/1 0001
  Time: 下午 3:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <a href="${pageContext.request.contextPath}/userlist.action">用户列表</a>
  <br/>
  <a href="${pageContext.request.contextPath}/handler.action">handler</a>
  <br/>
  <a href="${pageContext.request.contextPath}/person.action">person</a>

  <hr/>

  <!-- 向更深一层的包装类型中传递值 -->
  <form action="${pageContext.request.contextPath }/hello/deptDelete" method="post">
      <p>id:<input type="text" name="dept.deptId"></p>
      <p>name:<input type="text" name="dept.deptName"></p>
      <p>location:<input type="text" name="dept.deptLocation"></p>
      <p>price:<input type="text" name="price"></p>
      <p><input type="submit" value="提交"></p>
  </form>
  <br/>

  <a href="${pageContext.request.contextPath }/persons">需要登录才能访问的连接</a>

  </body>
</html>
