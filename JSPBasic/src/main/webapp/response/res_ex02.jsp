<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	
	<style >
	.form-content {margin: 0 auto; width: 200px; }
	.form-group {text-align: center; width:200px; }
	.form-control {width: 100%; box-sizing: border-box; }
	</style>
</head>
<body>
	
	<!-- 
	1. res_ex02_result.jsp페이지에서는 id, pw을 받아서 처리합니다.
	2. id가 abc1234이고 비밀번호가 asd123이라면 로그인 성공으로 간주하고 res_ex02_welcome 리다이렉트
	3. id, pw가 틀린경우 res_ex02_fail페이지로 리다이렉트
	 -->
	<section>
		<div class="form-content">
		
			<form action="res_ex02_result.jsp" method="post" class="form-group">
			
				<span>로그인 폼</span>	
				<input type="text" name="id" placeholder="아이디" class="form-control"><br>
				<input type="password" name="pw" placeholder="비밀번호" class="form-control"><br>
				
				<input type="submit" value="로그인" class="form-control">
			</form>	
		</div>
	</section>

</body>
</html>