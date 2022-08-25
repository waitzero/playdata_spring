<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h4>이 화면을 띄워보새용</h4>
	<form action="parma1" method="post">
	ID:<input type ="text" name="id"><br>
	PW:<input type ="text" name="pw"><br>
	
	관심분야:
	<input type ="checkbox" name="inter">자바<br>
	<input type ="checkbox" name="inter">JSP<br>
	<input type ="checkbox" name="inter">SPRING<br>
	<input type="submit" value="파라미터 값 받기">
	</form>
	
	
	
</body>
</html>