<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<!-- 
	post방식은 반드시 form으로 전송해야합니다. 
	method속성을 post로 맞추면 됩니다.
	-->
	
	<form action="req_ex06.jsp" method="post" >
	
		아이디:<input type="text" name="id">
		비밀번호:<input type="password" name="pw">
		<input type="submit" value="로그인">
	</form>
	



</body>
</html>