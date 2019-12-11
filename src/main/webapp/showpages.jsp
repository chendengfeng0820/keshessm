<%--
  Created by IntelliJ IDEA.
  User: cdf
  Date: 19-12-11
  Time: 下午1:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form action="/saveanswer">
    <table align="center">
        <tr>
            <td>1.你有女朋友吗？</td><td><input type="text" name="answer1"></td>
        </tr>
        <tr>
            <td>2.你每个月生活费够不够？</td><td><input type="text" name="answer2"></td>
        </tr>
        <tr>
            <td>3.你觉得自己的缺点是什么？</td><td><input type="text" name="answer3"></td>
        </tr>
        <tr>
            <td>4.你觉得自己的有点是什么？</td><td><input type="text" name="answer4"></td>
        </tr>
        <tr>
            <td>5.评价一下你的大学生活</td><td><input type="text" name="answer5"></td>
        </tr>
        <tr>
            <td><input type="submit" value="提交"></td>
        </tr>
    </table>
</form>

</body>
</html>
