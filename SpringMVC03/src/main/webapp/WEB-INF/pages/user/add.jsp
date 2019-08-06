<%--
  Created by IntelliJ IDEA.
  User: fxyh
  Date: 2019-08-06
  Time: 11:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>用户添加页码</title>
</head>
<body>
"${pageContext.request.contextPath}"
<form action="${pageContext.request.contextPath}/user/add" method="post">
    用户名：<input type="text" name="username" /><br />
    密码：<input type="password" name="password" /><br />
    薪资：<input type="number" name="salary" /><br />
    生日：<input type="date" name="birthday" /><br />
    <input type="submit" value="添加">
</form>

</body>
</html>
