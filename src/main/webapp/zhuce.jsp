<%--
  Created by IntelliJ IDEA.
  User: cdf
  Date: 19-12-11
  Time: 下午6:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/register" method="post">
    帐号：<input type="text" name="sid"></br>
    姓名：<input type="text" name="sname"></br>
    年龄：<input type="text" name="sage"></br>
    性别：<input type="text" name="ssex"></br>
    系别：<input type="text" name="scollege"></br>
    密码：<input type="text" name="spassword"></br>
    <input type="submit" value="提交">
</form>
</body>
</html>
