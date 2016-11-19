<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	Class.forName("com.mysql.jdbc.Driver");
	Connection cnn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student?user=root&password=mac&useUnicode=true&characterEncoding=utf-8");
	PreparedStatement psta =cnn.prepareStatement("select * from stu");
	ResultSet rs = psta.executeQuery();
	%>
	<table>
		<tr>
			<th>姓名</th>
			<th>性别</th>
			<th>操作</th>
		</tr>
		<%while(rs.next()){%>	
			<tr>
			<td><%=rs.getString(2)%></td>
			<td><%=rs.getString(3)%></td>
			<td><a href="personalInfo.jsp?id=<%=rs.getInt(1)%>">查看</a>|<a href="delPersonInfo.jsp?id=<%=rs.getInt(1)%>">删除</a></td>
		</tr>
		<% }%>
	</table>
</body>
</html>