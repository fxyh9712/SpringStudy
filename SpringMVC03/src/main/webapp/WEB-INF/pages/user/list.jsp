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
    <title>列表</title>
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
            <th>操作</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach items="${userList}" var="user">
            <tr>
                <td>${user.id}</td>
                <td>${user.username}</td>
                <td>${user.password}</td>
                <td>${user.salary}</td>
                <td><fmt:formatDate value="${user.birthday}" pattern="yyyy-MM-dd"/> </td>
                <td>
                    <a href="${pageContext.request.contextPath}/user/${user.id}/update">修改</a>&nbsp;&nbsp;
                    <a href="${pageContext.request.contextPath}/user/${user.id}/delete">删除</a>
                </td>
            </tr>
        </c:forEach>
    </tbody>
</table>
</body>
</html>
