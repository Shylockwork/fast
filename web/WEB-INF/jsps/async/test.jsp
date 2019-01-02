<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
    <script type="text/javascript" src="http://apps.bdimg.com/libs/jquery/2.1.1/jquery.min.js"></script>
    <script type="text/javascript" src="js/json.js"></script>
    <style type="text/css">
        a{
            text-decoration: none;
            display:block;
            border:1px solid gray;
            width:130px;
            text-align:

        }
    </style>
</head>
<body>
<form>
    <p><input type="text" id="personId" ></p>
    <p><input type="text" id="personName"></p>
    <p><input type="text" id="personGender"></p>
</form>
<div id="showPerson">
</div>
<button>异步案例</button>
<script type="text/javascript">
    //在这定义一个js的类
    function Person(personId,personName,personGender){
        this.personId = personId;
        this.personName = personName;
        this.personGender = personGender;

        this.setPersonId = function(personId){
            this.personId = personId;
        }
        this.getPersonId = function(){
            return this.personId;
        }
        this.setPersonName = function(personName){
            this.personName = personName;
        }
        this.getPersonName = function(){
            return this.personName;
        }
        this.setPersonGender = function(personGender){
            this.personGender = personGender;
        }
        this.getPersonGender = function(){
            return this.personGender;
        }
        this.toString = function(){
            alert(this.personId+"--" +this.personName+"--"+this.personGender);
        }
    }
    //创建一个Person对象
    /* var person = new Person(1,"zhangfei","nan"); */
    //person.toString();
    var btn = document.querySelector("button");
    btn.onclick = function(){
        //	var person = new Person(1,"zhangfei","nan");

        //使用jquery的方式查找到文本框对象，拿到其中的值
        var pid =$("#personId").val();
        var pname = $("#personName").val();
        var pgender = $("#personGender").val();
        var person = new Person(pid,pname,pgender)
        //	var str = '{"personId":1,"personName":"zhangfei"}';
        var str = JSON.stringify(person);
        //	alert(str);
        $.ajax({
            url:"${pageContext.request.contextPath}/ajaxPersonSave.do",
            type:"post",
            data:str,
            dataType:"json",
            contentType:"application/json;charset=utf-8",
            cache:false,
            success:function(data){
                //console.log(data);
                /* var objs = JSON.parse(data);
                console.log(objs); */
                var personDiv = $("#showPerson");
                $.each(data,function(i,person){
                    //创建段落标签
                    var p  = $("<p></p>").text(person.personId+"--"+person.personName+"--"+person.personGender);
                    personDiv.append(p);
                })

            }
        });
    }
</script>
<hr>
<form id="personForm">
    <input type="hidden" name="_method" value="put">
    <p>id:<input type="text" name="personId" ></p>
    <p>name:<input type="text" name="personName"></p>
    <p>gender:<input type="text" name="personGender"></p>
    <p><a href="javascript:void(0)" id="saveA">提交</a></p>
</form>
<script type="text/javascript">
    //查找到A链接
    var saveA = $("#saveA")
    //添加单击事件
    saveA.click(function(){
        $.ajax({
            url:"${pageContext.request.contextPath}/ajaxPersonUpdate.do",
            type:"post",
            /* data:${"#personForm"}.serialize(), */
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
</body>
</html>
