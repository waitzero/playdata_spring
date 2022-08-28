<%@page import="com.simple.bean.UserVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//리퀘스트에 강제로 담은 데이터를 사용하는 방법
	String newData = (String)request.getAttribute("newData");
	
	UserVO vo = (UserVO)request.getAttribute("vo");	
	String id = vo.getId();
	String pw = vo.getPw();
	String addr = vo.getAddr();
	String name = vo.getName();

%>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	2번화면에서 넘어온 데이터:<br>
	<%=newData %><br>
	<%=id %><br>
	<%=pw %><br>
	<%=addr %><br>
	<%=name %><br>
	
</body>
</html>