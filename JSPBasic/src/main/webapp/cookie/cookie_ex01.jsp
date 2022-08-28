<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	Cookie[] arr = request.getCookies();


	String ch = "";

	if(arr != null) { //쿠키가 존재하면
		for(Cookie c : arr) {
			if(c.getName().equals("check")  ) {
				ch = c.getValue();
			}
		}
	}
%>    
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 
		쿠키는 개념을 이해하세요
		2. check쿠키값을 확인해서 value속성에 check쿠키의 값을 저장하면됩니다
	
	 -->
	
	<form action="cookie_ex01_result.jsp" method="post">
	
		아이디:<input type="text" name="id" value="<%=ch %>"><br>
		비밀번호:<input type="password" name="pw"><br>
		<input type="submit" value="로그인">
		<input type="checkbox" name="check" value="y" checked='<%=ch != null ? "checked" : "" %>'>아이디기억하기
		
	</form>
	
	
</body>
</html>