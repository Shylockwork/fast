<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/12/22
  Time: 10:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
    <script src="http://apps.bdimg.com/libs/jquery/2.1.1/jquery.min.js">
    </script>
</head>
<body>

<form id="loginForm">
    <p id="msg"></p>
    <p>用户名:<input type="text" name="uname"></p>
    <p>密码:<input type="password" name="upassword"></p>
    <p><a href="javascript:void(0)" id="login">登录</a></p>
</form>
<script type="text/javascript">
    //获取超链接对象
    var loginA = $("#login");
    loginA.click(function(){
        $.ajax({
            url:"${pageContext.request.contextPath}/users",
            type:"get",
            data:$("#loginForm").serialize(),
            dataType:"json",
            contentType:"application/x-www-form-urlencoded;charset=utf-8",
            cache:false,
            success:function(data){
                alert(data.state+"--"+data.message);
                //送回的对象中包含响应码--200，表示登录成功
                if(data.state == 200){
                    $("#msg").text("");
                    location.href = "index.jsp";
                }else{
                    $("#msg").text(data.message);
                }
            }
        });
    });
</script>
</body>
</html>
