<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//순수한 자바코드가 작성되는 곳, servlet대체가 가능.

	request.setCharacterEncoding("utf-8"); //인코딩

	String name = request.getParameter("name");
	String age = request.getParameter("age");
	
	int a = Integer.parseInt(age); //형변환
	
	//age가 20세 전후여부에 따라서 다른페이지로 이동
	if(a >= 20) {
		response.sendRedirect("res_ex01_ok.jsp");
	} else {
		response.sendRedirect("res_ex01_no.jsp");
	}
	

%>    
