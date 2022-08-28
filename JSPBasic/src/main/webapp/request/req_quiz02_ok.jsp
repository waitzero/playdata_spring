<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8"); 

	//String
	String name = request.getParameter("name");
	String cm = request.getParameter("cm");
	String kg = request.getParameter("kg");
	
	//형변환 -> 구글링
	//String -> 정수 : Integer.parseInt(값)
	double a = Double.parseDouble(cm);  
	double b = Double.parseDouble(kg);
	double bmi = b / (a/100 * a/100);
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	이름:<%=name %><br>
	체질량지수:<%=bmi %><br>
	<% if(bmi >= 25) { %>
		과체중입니다
	<% } else if(bmi <= 18) { %>
		저체중입니다
	<% } else { %>
		정상입니다
	<% } %>
	
	
	
	
</body>
</html>