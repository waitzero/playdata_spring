<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h3>목록화면</h3>
	
	<c:forEach var="vo" items="${list }" varStatus="status">
		${vo.sno }번- 이름:${vo.name } 국어:${vo.kor } 영어:${vo.eng } 수학:${vo.math } 
		<button type="button" onclick="location.href='scoreDelete?num=${vo.sno}' " >삭제</button>
		<br> 
	</c:forEach>
	
	
	
	<a href="scoreRegist">점수  등록하기</a>
	
	
	
	
	
	
</body>
</html>