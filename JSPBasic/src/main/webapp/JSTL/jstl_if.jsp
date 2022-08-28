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
	<!-- test에는 조건 -->
	<c:if test="true">
		참입니다
	</c:if>
	
	
	<!-- jstl의 변수선언 -->
	<c:set var="num" value="1" />
	<!-- jstl의 출력 -->
	<c:out value="${num }" />
	
	<br>
	<c:if test="${num >= 1 }">
		참입니다
	</c:if>
	
	
	
	
</body>
</html>