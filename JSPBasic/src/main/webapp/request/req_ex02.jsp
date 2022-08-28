<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//자바코드가 들어가는 곳
	String uri = request.getRequestURI(); //uri값
	String remote = request.getRemoteAddr(); //접속한 ip주소
	
	
	
	String id = request.getParameter("id"); //input태그의 name값
	String pw = request.getParameter("pw"); //input태그의 name값
	
%>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<h3>req_ex02페이지</h3>
	접속한ip주소: <%=remote %><br>
	uri값: <%=uri %><br>
	화면에서 넘긴 id값: <%=id %><br>
	화면에서 넘긴 pw값: <%=pw %><br>
	
</body>
</html>