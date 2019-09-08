<%--
  Created by IntelliJ IDEA.
  User: Qius
  Date: 2019/9/7
  Time: 10:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>upload</title>
</head>
<body>
    <form action="testUpload" method="post" enctype="multipart/form-data">
        <input type="file" name="file" />
        <input type="submit" value="上传" />
    </form>
</body>
</html>
