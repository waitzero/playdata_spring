<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h2>path03페이지</h2>
	
	<a href="../../controller/controllerTest.jsp">컨트롤러테스트페이지로(상대)</a>
	<a href="/JSPBasic/controller/controllerTest.jsp">컨트롤러테스트페이지로(절대)</a>


	<!-- BasicServlet으로 절대경로, 상대경로 (힌트: 서블릿을실행해서 경로를 확인)  -->
	<a href="/JSPBasic/apple">베이직서블릿</a>
	<a href="../../apple">베이직서블릿</a>

</body>
</html>