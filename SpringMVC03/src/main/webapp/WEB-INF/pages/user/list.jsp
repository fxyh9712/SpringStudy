<%--
  Created by IntelliJ IDEA.
  User: fxyh
  Date: 2019-08-06
  Time: 11:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ include file="../common/taglib.jsp" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="1" cellpadding="0" cellspacing="0">
    <thead>
        <tr>
            <th>id</th>
            <th>用户名</th>
            <th>密码</th>
            <th>薪资</th>
            <th>生日</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach items="${userList}" var="user">
            <tr>${user.id}</tr>
            <tr>${user.username}</tr>
            <tr>${user.password}</tr>
            <tr>${user.salary}</tr>
            <tr><fmt:formatDate value="${user.birthday}" pattern="yyyy-MM-dd"/> </tr>
        </c:forEach>
    </tbody>
</table>
</body>
</html>
