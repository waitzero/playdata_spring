<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//특정세션 삭제
	session.removeAttribute("user_name");

	String user_id = (String)session.getAttribute("user_id");
	String user_name = (String)session.getAttribute("user_name");


%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<h3>세션값 확인</h3>
	<%=user_id %><br>
	<%=user_name %><br>
	
	
</body>
</html>