<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	session.setAttribute("user_id", "xxx123"); //키, 값
	session.setAttribute("user_name", "홍길동"); //키, 값

%>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	
	<a href="session_basic_ok.jsp">세션값 확인하기</a>
	
	
</body>
</html>