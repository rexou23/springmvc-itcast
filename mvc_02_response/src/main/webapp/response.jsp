<%--
  Created by IntelliJ IDEA.
  User: Qius
  Date: 2019/9/7
  Time: 0:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>response</title>
    <script src="js/jquery-3.4.1.min.js"></script>
    <script>
        $(function () {
            $("#btn").click(function () {
                $.ajax({
                    url:"user/testAjax",
                    data:'{"username":"rex","age":"20","password":"123123"}',
                    contentType:"application/json;charset=UTF-8",
                    dataType:"json",
                    type:"post",
                    success:function (data) {
                        //data服务器端响应的json数据，进行解析
                        alert(data);
                        alert(data.username);
                        alert(data.password);
                        alert(data.age);
                    }
                });
            });
        });


    </script>
</head>
<body>
    <a href="user/testString">testString</a> <br/><br/>
    <a href="user/testVoid">testVoid</a> <br/><br/>

    <button id="btn">发送ajax请求</button>
</body>
</html>
