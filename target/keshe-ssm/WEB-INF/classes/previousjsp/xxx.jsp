<%@ page import="java.util.Map" %>
<%@ page import="java.util.LinkedHashMap" %><%--
  Created by IntelliJ IDEA.
  User: cdf
  Date: 19-12-11
  Time: 下午7:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    Map<String, String> map = new LinkedHashMap<String, String>();
    for(int i=0;i<20;i++){
        map.put(String.valueOf(i), "name"+i);

    }
    request.setAttribute("map", map);
%>
<table>
    <tr>
        <th>姓名</th>
        <th>年龄</th>
        <th>性别</th>
        <th>系别</th>
    </tr>

    <c:forEach var="entry" items="<%= map %>" begin="0" end="9" varStatus="s" >
        <tr>
            <td><c:out value="${entry.key}"/></td>
            <td><c:out value="${entry.value}"/></td>
            <c:forEach var="o" items="<%= map %>" begin="${s.index+10}" end="${s.index+10}"  >
                <td><c:out value="${o.key}"/></td>
                <td><c:out value="${o.value}"/></td>
            </c:forEach>
        </tr>
    </c:forEach>
</table>
</body>
</html>
