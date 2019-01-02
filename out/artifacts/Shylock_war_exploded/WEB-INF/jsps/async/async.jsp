<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/12/20
  Time: 16:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ajax实现异步请求</title>
    <script src="http://apps.bdimg.com/libs/jquery/2.1.1/jquery.min.js">
    </script>
</head>
<body>


<button>ajax请求</button>
<script type="text/javascript">
    var btn = document.querySelector("button");
    btn.onclick = function () {
        var str = '{"teacherId":1,"teacherName":"张飞","teacherWorktime":2000}'
        $.ajax({
            url:"${pageContext.request.contextPath}/async/ajax.async",
            type:"post",
            data:str,
            //从后台送回来进行编码
            dataType:"json",
            //发送的内容的格式 此行不能省,否则送不过去
            contentType:"application/json;charset=utf-8",
            cache:false,
            //成功返回的数据
            success: function (data) {
                console.log(data);
            }
        });
    }

</script>

</body>
</html>
