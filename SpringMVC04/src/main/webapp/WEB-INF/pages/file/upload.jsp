<%--
  Created by IntelliJ IDEA.
  User: fxyh
  Date: 2019-08-09
  Time: 13:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>文件上传</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/file/upload" method="post" enctype="multipart/form-data">
    文件：<input type="file" name="file" /><br />
    <input type="submit" value="上传" />
</form>
</body>
</html>
