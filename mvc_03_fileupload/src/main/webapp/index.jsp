<%--
  Created by IntelliJ IDEA.
  User: Qius
  Date: 2019/9/7
  Time: 16:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>index</title>
</head>
<body>
    <form action="upload/upload1" method="post" enctype="multipart/form-data">
        <input type="file" name="file1" /><br />
        <input type="submit" value="上传1" />
    </form>
    <hr />

    <form action="upload/upload2" method="post" enctype="multipart/form-data">
        <input type="file" name="file2" /><br />
        <input type="submit" value="上传2" />
    </form>

    <hr />

    <form action="upload/upload3" method="post" enctype="multipart/form-data">
        <input type="file" name="file3" /><br />
        <input type="submit" value="上传3" />
    </form>

    <hr />

    <form action="upload/upload4" method="post" enctype="multipart/form-data">
        <input type="file" name="file4" /><br />
        <input type="submit" value="上传4 跨服务器上传" />
    </form>

</body>
</html>
