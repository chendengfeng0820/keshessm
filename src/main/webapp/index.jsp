<%--
  Created by IntelliJ IDEA.
  User: cdf
  Date: 19-12-9
  Time: 下午7:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>测试</title>
</head>
<body>

    <a href="/account/findAll">测试</a>

<form action="/account/save" method="post">
    姓名：<input type="text" name="name">
    金额：<input type="text" name="money">
    <input type="submit" value="提交">
</form>
</body>
</html>
