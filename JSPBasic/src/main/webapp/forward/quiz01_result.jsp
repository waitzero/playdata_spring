<%@page import="com.simple.bean.PointVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	PointVO vo = (PointVO)request.getAttribute("vo");
	
%>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<%=vo.getName() %><br>
	<%=vo.getSum() %><br>
	<%=vo.getAvg() %><br>
	
</body>
</html>