<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>이 화면을 띄워보세용</h3>
	
	<form action="param1" method="post">
		ID:<input type="text" name="id"><br>
		PW:<input type="text" name="pw"><br>
		
		관심분야:
		<input type="checkbox" name="inter" value="a">자바<br>
		<input type="checkbox" name="inter" value="b">JSP<br>
		<input type="checkbox" name="inter" value="c">SPRING<br>
	
	
		<input type="submit" value="파라미터값받기">
	
	</form>
	
	
	
</body>
</html>