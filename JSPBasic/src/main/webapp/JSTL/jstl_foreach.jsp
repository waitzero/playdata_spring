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

	<!-- 일반for, 향상된for -->
	<%-- 
	<%
		int sum = 0;
		for(int i = 1; i <= 100; i++) {
			sum += i;
		}
	%>
	<%=sum %>
	--%>
	
	<!-- step은 1일경우에 생략 가능 -->
	<c:set var="sum" value="0" />
	<c:forEach var="i" begin="1" end="100" step="1"> 
		<c:set var="sum" value="${sum + i }"/>
	</c:forEach>
	${sum }
	
	
	<br>
	<!-- 구구단 3단 출력 -->
	<c:forEach var="i" begin="1" end="9" >
		3 x ${i } = ${3 * i }<br>
	</c:forEach>
	
	<br>
	<!-- 모모든 구구단 출력 -->
	<%-- 
	<%
		for(int i = 2; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				System.out.println(i + " x " + j + " = " + (i*j) );
			}
		}
	
	%>
	 --%>
	
	<c:forEach var="i" begin="2" end="9">
		${i }단<br>
		<c:forEach var="j" begin="1" end="9">
			${i } x ${j } = ${i*j }<br>
		</c:forEach>
	</c:forEach>
	
	
	<br>
	
	<%-- 
	<%
		int[] arr = new int[] {1,2,3,4,5};
	
		for(int a : arr ) {
			out.println(a);
		}
	%>
	 --%>
	<c:set var="arr" value="<%= new int[] {1,2,3,4,5} %>"/>
	
	<c:forEach var="a" items="${arr }" varStatus="k">
		인덱스번호:${k.index },
		카운트번호:${k.count },
		${a }
		<br>
	</c:forEach>
	
	
	
	
	
	
	

</body>
</html>