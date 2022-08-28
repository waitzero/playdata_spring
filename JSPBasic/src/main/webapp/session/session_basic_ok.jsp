<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//세션의 사용
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
	
	<h4>세션값</h4>
	<%=user_id %><br>
	<%=user_name %><br>
	
	<a href="session_basic_remove.jsp">특정세션삭제</a>
	<a href="session_basic_invalid.jsp">세션전부삭제</a>
	
</body>
</html>