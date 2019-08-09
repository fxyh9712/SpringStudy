<%--
  Created by IntelliJ IDEA.
  User: fxyh
  Date: 2019-08-08
  Time: 20:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>ajax</title>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jQuery.js"></script>
</head>
<body>
<button type="button" onclick="send()">请求</button>
<script type="text/javascript">
    function send() {
        var person = {username: 'zhamgsan', age: 18};

        $.ajax({
            type: 'post',
            url: '${pageContext.request.contextPath}/ajax/test',
            contentType: 'application/json;charset=utf-8',
            data: JSON.stringify(person),
            success: function (data) {
                alert(data.username+'---------'+data.age)
            }
        });
    }
</script>
</body>
</html>
