<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<!-- 포스트방식으로 req_quiz_ok 페이지로 전송을 합니다 
	ok페이지에서는 넘어온 값을 화면에 출력하면 됩니다.
	
	checkbox값은 getParameterValues() 속성을 이용하면 됩니다.
	-->
	
	
	<form action="req_quiz_ok.jsp" method="post">
	
		아이디:<input type="text" name="id">
		<br>
		비밀번호:<input type="password" name="pw">
		<br>
		
		
		<!-- 체크박스는 name속성을 동일하게 작성해서 그룹화 해야합니다. -->
		관심분야:
		<input type="checkbox" name="intro" value="java">자바
		<input type="checkbox" name="intro" value="spring">스프링
		<input type="checkbox" name="intro" value="boot">스프링부트
		<input type="checkbox" name="intro" value="python">파이썬
		<br>
		
		<!-- 라디오는 name속성을 동일하게 작성해서 그룹화 해야합니다. -->
		전공:
		<input type="radio" name="major" value="1">컴공
		<input type="radio" name="major" value="2">디자인
		<input type="radio" name="major" value="3">산업공학
		<input type="radio" name="major" value="4">미디어소프트웨어
		
		
		<br>
		지역:
		<select name="region">
			<option value="s1">서울</option>
			<option value="s2">경기도</option>
			<option value="s3">부산</option>
			<option value="s4">대구</option>
		</select>
		
		<br>
		자기소개:
		<textarea rows="5" cols="50" name="topic"></textarea>
		
		<br>
		<!-- JS를 이용해서 동적인 기능을 붙여서 사용 -->
		<input type="button" value="아무기능없는버튼" >
		<button type="button">아무기능없는버튼</button>
		<!-- 폼으로 감싸져있는 태그들을 전송 -->
		<input type="submit" value="폼태그전송">
		
		
	</form>


</body>
</html>