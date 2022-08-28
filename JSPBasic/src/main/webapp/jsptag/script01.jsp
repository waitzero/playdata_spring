<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%-- 
	<%
	//순수한 자바코드
	int num = 0;
	if(num == 0){
		//System.out.println("참입니다");
		out.println("참입니다"); //화면으로출력
	} else {
		//System.out.println("거짓입니다");
		out.println("거짓입니다"); //화면으로출력
	}
	%>
 --%>
	
	<%
	int num = 0;
	if(num == 0) { %>
		<b>참입니다</b>
				
	<% } else { %>
		<b>거짓입니다</b>
		
	<% }%>

	<h3>a태그를 20개 반복문을 이용해서 생성</h3>
	
	
	<% for(int i = 1; i <= 20; i++) { %>
		<a href="#">a태그값..</a>
	<% } %>
	
	
	
	<h3>표현식</h3>
	<%
		int num2 = 10;
		String str = "안녕하세요";
	%>	

	num2의값: <%=num2 %><br>
	str의값: <%=str %><br>






</body>
</html>