<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/12/21
  Time: 9:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>异步第一个案例</title>
    <style>
        a{
            text-decoration: none;
            display: block;
            border: 1px solid gray;
            width: 130px;
            text-align: center;
            background-color: deeppink;
        }
    </style>
    <script src="http://apps.bdimg.com/libs/jquery/2.1.1/jquery.min.js">
    </script>
    <script type="text/javascript" src="/resources/js/json2.js">
    </script>
</head>


<body>
<%--<button>第一个案例</button>--%>
<div id="showPerson"></div>
<%--<script type="text/javascript">--%>
    <%--//定义一个js类--%>
    <%--function Person(personId,personName,personGender) {--%>
       <%--this.personId = personId;--%>
       <%--this.personName = personName;--%>
       <%--this.personGender = personGender;--%>

       <%--this.setPersonId = function (personId) {--%>
           <%--this.personId = personId;--%>
       <%--}--%>
       <%--this.getPersonId = function () {--%>
           <%--return this.personId;--%>
       <%--}--%>

        <%--this.setPersonName = function (personName) {--%>
            <%--this.personName = personName;--%>
        <%--}--%>
        <%--this.getPrsonName = function () {--%>
            <%--return this.personName;--%>
        <%--}--%>
        <%--this.setPersonGender = function (personGender) {--%>
            <%--this.personGender = personGender;--%>
        <%--}--%>
        <%--this.getPersonGender = function () {--%>
            <%--return this.personGender;--%>
        <%--}--%>

        <%--this.toString = function () {--%>
            <%--alert("num: "+this.getPersonId()+"name: "+this.getPrsonName()+ "gender: "+this.getPersonGender());--%>
        <%--}--%>

    <%--}--%>
    <%--//创建一个person对象--%>
   <%--// var person = new Person(1,"飞哥传说","man");--%>

    <%--&lt;%&ndash;var btn = document.querySelector("button");&ndash;%&gt;--%>
    <%--&lt;%&ndash;btn.onclick = function () {&ndash;%&gt;--%>
        <%--&lt;%&ndash;var personId = $("#personId").val();&ndash;%&gt;--%>
        <%--&lt;%&ndash;var personName = $("#personName").val();&ndash;%&gt;--%>
        <%--&lt;%&ndash;var personGender = $("#personGender").val();&ndash;%&gt;--%>
        <%--&lt;%&ndash;var person = new Person(personId,personName,personGender);&ndash;%&gt;--%>

        <%--&lt;%&ndash;//person.toString();&ndash;%&gt;--%>
        <%--&lt;%&ndash;var str = JSON.stringify(person);&ndash;%&gt;--%>
       <%--&lt;%&ndash;// alert(str);&ndash;%&gt;--%>
        <%--&lt;%&ndash;&lt;%&ndash;var str = '{"teacherId":1,"teacherName":"张飞","teacherWorktime":2000}'&ndash;%&gt;&ndash;%&gt;--%>
        <%--&lt;%&ndash;$.ajax({&ndash;%&gt;--%>
            <%--&lt;%&ndash;url:"${pageContext.request.contextPath}/async/ajax.async2",&ndash;%&gt;--%>
            <%--&lt;%&ndash;type:"post",&ndash;%&gt;--%>
            <%--&lt;%&ndash;data:str,&ndash;%&gt;--%>
            <%--&lt;%&ndash;//从后台送回来进行编码&ndash;%&gt;--%>
            <%--&lt;%&ndash;dataType:"json",&ndash;%&gt;--%>
            <%--&lt;%&ndash;//发送的内容的格式 此行不能省,否则送不过去&ndash;%&gt;--%>
            <%--&lt;%&ndash;contentType:"application/json;charset=utf-8",&ndash;%&gt;--%>
            <%--&lt;%&ndash;cache:false,&ndash;%&gt;--%>
            <%--&lt;%&ndash;//成功返回的数据&ndash;%&gt;--%>
            <%--&lt;%&ndash;success: function (data) {&ndash;%&gt;--%>
               <%--&lt;%&ndash;var personDive = $("#showPerson");&ndash;%&gt;--%>
               <%--&lt;%&ndash;$.each(data,function(i,person){&ndash;%&gt;--%>
                   <%--&lt;%&ndash;var p = $("<p></p>").text(person.personId+"---"+person.personName+"---"+person.personGender);&ndash;%&gt;--%>
                   <%--&lt;%&ndash;personDive.append(p);&ndash;%&gt;--%>
               <%--&lt;%&ndash;});&ndash;%&gt;--%>
            <%--&lt;%&ndash;}&ndash;%&gt;--%>
        <%--&lt;%&ndash;});&ndash;%&gt;--%>
    <%--&lt;%&ndash;}&ndash;%&gt;--%>
<%--</script>--%>

<form id="personForm">
    <input type="hidden" name="_method" value="put">
    <p><input type="text" name="personId" ></p>
    <p><input type="text" name="personName"></p>
    <p><input type="text" name="personGender"></p>
    <%--<p><button id="saveA">提交</button></p>--%>
    <p><a href="javascript:void(0)" id="saveA">提交</a></p>
</form>

<script type="text/javascript">
    //查找到A链接
    var saveA = $("#saveA")
    //添加单击事件
    saveA.click(function(){
        $.ajax({
            url:"${pageContext.request.contextPath}/async/ajax.async3",
            type:"post",
            data:$("#personForm").serialize(),
            dataType:"json",
            contentType:"application/x-www-form-urlencoded;charset=utf-8",
            cache:false,
            success:function(data){
                console.log(data);
            }
        });
    });
</script>


<%--<br/>--%>
<%--<form id="deleteForm">--%>

    <%--<input type="hidden" name="_method" value="delete">--%>
    <%--<button id="delA">保存</button>--%>

<%--</form>--%>

</body>
</html>
