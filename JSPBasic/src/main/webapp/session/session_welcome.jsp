<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//세션이 없는 경우에는 접근하지 못하도록 처리
	if( session.getAttribute("user_id") == null   ) {
		response.sendRedirect("session_login.jsp");
	}
	
	String user_id = (String)session.getAttribute("user_id");
	String user_nick = (String)session.getAttribute("user_nick");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<%=user_id %>(<%=user_nick %>)님 환영합니다.
	
	
	<a href="session_logout.jsp">로그아웃</a>
	
	
</body>
</html>