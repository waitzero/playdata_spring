<%@page import="com.simple.bean.UserVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//포워드로 넘어온값 확인
	/*
	UserVO vo (UserVO)request.getAttribute("vo");
	String addr = vo.getAddr();
	String id = vo.getId();
	String pw = vo.getPw();
	String name = vo.getName();
	*/
			
%>        
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	${vo.addr }<br>
	${vo.id }<br>
	${vo.pw }<br>
	${vo.name }<br>
	
	<!-- 세션안에 들어있는 값 sessionScope를 붙여주는 편이 좋습니다 -->
	${sessionScope.aaa }

</body>
</html>