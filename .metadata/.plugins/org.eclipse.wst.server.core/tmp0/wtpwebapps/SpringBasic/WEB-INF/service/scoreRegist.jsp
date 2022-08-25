<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>서비스 영역 만들어 보기</h3>
	
	<form action="scoreForm" method="post">
		이름:<input type="text" name="name">
		국어:<input type="text" name="kor">
		영어:<input type="text" name="eng">
		수학:<input type="text" name="math">
		<input type="submit" name="등록">
	</form>
</body>
</html>