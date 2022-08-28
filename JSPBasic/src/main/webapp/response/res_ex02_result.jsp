<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
 	request.setCharacterEncoding("utf-8");

	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	
	//문자열 비굔느 equals
	if( id.equals("abc1234") && pw.equals("asd123") ) {
		
		response.sendRedirect("res_ex02_welcome.jsp");
		
	} else {
		
		response.sendRedirect("res_ex02_fail.jsp");
	}

%>
    