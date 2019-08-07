<%--
  Created by IntelliJ IDEA.
  User: fxyh
  Date: 2019-08-07
  Time: 09:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>更新</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/user/update" method="post">
    <input type="hidden" name="id" value="${user.id}"/>
    用户名：<input type="text" name="username" value="${user.username}"/><br />
    密码：<input type="password" name="password" value="${user.password}" /><br />
    薪资：<input type="number" name="salary" value="${user.salary}" /><br />
    生日：<input type="date" name="birthday" value="${user.birthday}" /><br />
    <input type="submit" value="更新">
</form>

</body>
</html>
