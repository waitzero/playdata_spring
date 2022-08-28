<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//쿠키는 한번 생성해놓으면, 시간이 만료되기 전까지 or 직접 삭제하기전까지
	//어디서든 사용가능합니다.
	//request에 자동으로 저장됩니다.
	Cookie[] arr = request.getCookies();
	
	String v = "";

	for(Cookie c : arr) {
		String name = c.getName(); //쿠키의 이름
		if(name.equals("user_id")) {
			v = c.getValue();
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
	<h3>로그인 성공페이지</h3>
	로그인한 회원정보:<%=v %>
	
	
</body>
</html>