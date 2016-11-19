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
		String [] s={"青霞","六耳猕猴","唐僧"};
		String id=request.getParameter("id");
		if(id!=null){
			if(id.equals("1")){
				out.print(s[0]);
			}else if(id.equals("2")){
				out.println(s[1]);
			}else if(id.equals("3")){
				out.print(s[2]);
			}		
	%> 
	<% }	else {%>
			<%="你咋不输id啊!"%>
	<%	}%>
		
	
	
</body>
</html>