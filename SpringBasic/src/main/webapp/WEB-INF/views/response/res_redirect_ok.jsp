<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	로그인성공
	
	<script>
		var msg = '${msg}';
		if(msg != '') {
			alert(msg);
		}
	</script>
	
	
</body>
</html>