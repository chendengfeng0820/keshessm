<%--
  Created by IntelliJ IDEA.
  User: cdf
  Date: 19-12-11
  Time: 下午7:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <tr><td>姓名</td><td>年龄</td><td>性别</td><td>系别</td></tr>
    <c:forEach items="list" var="s">
        <tr><td>#{s.id}</td><td>#{s.name}</td><td>#{s.age}</td></tr>
    </c:forEach>
</table>
</body>
</html>
