<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	

	<!-- 주석: ctrl + shift + / --> 
	<!-- 폼태그는 서버로 데이터를 전송하는데 사용합니다 -->
	<!-- form안에 태그들은 name속성을 반드시 가집니다 -->
	<form action="https://www.naver.com">
	
		아이디:<input type="text" name="식별">
		<br>
		비밀번호:<input type="password" name="pw">
		<br>
		
		<!-- 체크박스는 name속성을 동일하게 작성해서 그룹화 해야합니다. -->
		관심분야:
		<input type="checkbox" name="intro">자바
		<input type="checkbox" name="intro">스프링
		<input type="checkbox" name="intro">스프링부트
		<input type="checkbox" name="intro">파이썬
		<br>
		
		<!-- 라디오는 name속성을 동일하게 작성해서 그룹화 해야합니다. -->
		전공:
		<input type="radio" name="major">컴공
		<input type="radio" name="major">디자인
		<input type="radio" name="major">산업공학
		<input type="radio" name="major">미디어소프트웨어
		
		
		<br>
		지역:
		<select name="region">
			<option>서울</option>
			<option>경기도</option>
			<option>부산</option>
			<option>대구</option>
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