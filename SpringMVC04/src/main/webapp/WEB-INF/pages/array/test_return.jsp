<%--
  Created by IntelliJ IDEA.
  User: fxyh
  Date: 2019-08-08
  Time: 15:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@include file="../common/taglib.jsp" %>
<html>
<head>
    <title>arr</title>
</head>
<body>
<c:forEach var="test" items="${arr}">${test},</c:forEach>
</body>
</html>