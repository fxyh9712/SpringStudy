<%--
  Created by IntelliJ IDEA.
  User: fxyh
  Date: 2019-08-08
  Time: 15:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>arr</title>
</head>
<body>
语言：<br/>
<form action="${pageContext.request.contextPath}/array/test" method="post">
    <input type="checkbox" name="arr" value="java"/>java<br/>
    <input type="checkbox" name="arr" value="c"/>c<br/>
    <input type="checkbox" name="arr" value="c++"/>c++<br/>
    <input type="submit" value="提交"/>
</form>

</body>
</html>
