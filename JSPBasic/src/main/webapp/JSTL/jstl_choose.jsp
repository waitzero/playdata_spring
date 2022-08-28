<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>       
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<c:set var="name" value="홍길동"/>
	<c:set var="age" value="20" />
	
	<!-- jstl elseif문 -->
	<c:choose>
		<c:when test="${name eq '홍길동' }">
			<b>홍길동입니다</b>
		</c:when>
		<c:when test="${name eq '이순신' }">
			<b>이순신입니다</b>
		</c:when>
		<c:otherwise>
			<b>이순신 홍길동이 아닙니다</b>		
		</c:otherwise>
	</c:choose>
	
	
	<!-- age가 20세 이상이면 성인입니다, 미만이면 미성년자입니다 -->
	<c:choose>
		<c:when test="${age >= 20 }">
			성인입니다
		</c:when>
		<c:otherwise>
			미성년자입니다
		</c:otherwise>
	</c:choose>
	
	
	
	
	
	
</body>
</html>