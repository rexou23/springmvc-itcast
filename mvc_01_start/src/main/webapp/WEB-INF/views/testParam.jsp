<%--
  Created by IntelliJ IDEA.
  User: Qius
  Date: 2019/9/6
  Time: 20:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="add" method="post">
        姓名：<input type="text" name="name" />
        年龄：<input type="text" name="age" />
        城市：<input type="text" name="addr.city" />
        街道：<input type="text" name="addr.strees" />
        生日：<input type="text" name="birth" />

        <input type="submit" value="提交"/>
    </form>
</body>
</html>
