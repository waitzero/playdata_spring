<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");
	//첫번쨰 화면에서 넘어온 파라미터값
	String name = request.getParameter("name");
	String point = request.getParameter("point");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	3페이지<br>
	<%=name %><br>
	<%=point %><br>
	
</body>
</html>