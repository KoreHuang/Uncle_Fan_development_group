<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String sno=request.getParameter("sno");
	Class.forName("com.mysql.jdbc.Driver");
	Connection cnn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student?user=root&password=mac&useUnicode=true&characterEncoding=utf-8");
	PreparedStatement psta =cnn.prepareStatement("select * from stu where id=?");
	psta.setString(1, sno);
	ResultSet rs = psta.executeQuery();
	if(rs.next()){%>
		<ul style="list-style:none;display:block;margin:0 auto;width:960px;border:1px solid red;">
			<li><%=rs.getInt("id") %></li>
			<li><%=rs.getString("name") %></li>
			<li><%=rs.getString("sex") %></li>
			<li><%=rs.getInt("age") %></li>
		</ul>		
	<% }else{%>
	<%="未查询到相应结果!"%>
	<%} %>
</body>
</html>