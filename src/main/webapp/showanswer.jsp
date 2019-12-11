<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"%>
<%@ page import="com.mysql.jdbc.Driver" %>
<%@ page import="java.sql.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>show</title>
</head>
<body bgcolor="#f0ffff">
<%
    //加载驱动程序
    String driverName="com.mysql.jdbc.Driver";
//数据库信息
    String userName="root";
//密码
    String userPasswd="820820";
//数据库名
    String dbName="ssmkeshe";

//将数据库信息字符串连接成为一个完整的url（也可以直接写成url，分开写是明了可维护性强）
    String url="jdbc:mysql://localhost:3306/"+dbName+"?user="+userName+"&password="+userPasswd;
    Class.forName("com.mysql.jdbc.Driver").newInstance();
    Connection conn=DriverManager.getConnection(url);
    Statement stmt = conn.createStatement();
    String sql="SELECT * FROM student";
    ResultSet rs = stmt.executeQuery(sql);
    out.print("姓名");
    out.print("&nbsp");
    out.print("|");
    out.print("&nbsp");
    out.print("年龄");
    out.print("&nbsp");
    out.print("|");
    out.print("&nbsp");
    out.print("性别");
    out.print("&nbsp");
    out.print("|");
    out.print("&nbsp");
    out.print("系别");
    out.print("&nbsp");
    out.print("<br>");
    while(rs.next()) {
        out.print("&nbsp");
        out.print("&nbsp");
        out.print("&nbsp");
        out.print(rs.getString(2)+" ");
        out.print("&nbsp");
        out.print("&nbsp");
        out.print("|");
        out.print("&nbsp");
        out.print(rs.getString(4)+" ");
        out.print("|");
        out.print("&nbsp");
        out.print("&nbsp");
        out.print(rs.getString(3)+" ");
        out.print("&nbsp");
        out.print("&nbsp");
        out.print("|");
        out.print("&nbsp");
        out.print("&nbsp");
        out.print(rs.getString(5)+" ");
        out.print("|");
        out.print("&nbsp");
        out.print("&nbsp");
        out.print(rs.getString(8));
        out.print("|");
        out.print("&nbsp");
        out.print("&nbsp");
        out.print(rs.getString(9));
        out.print("|");
        out.print("&nbsp");
        out.print("&nbsp");
        out.print(rs.getString(10));
        out.print("|");
        out.print("&nbsp");
        out.print("&nbsp");
        out.print(rs.getString(11));
        out.print("|");
        out.print("&nbsp");
        out.print("&nbsp");
        out.print(rs.getString(12));
        out.print("<br>");
    }
    out.print("<br>");
    rs.close();
    stmt.close();
    conn.close();
%>
<button onclick="window.location.href='first.jsp'" value="返回"></button>
</body>
</html>
