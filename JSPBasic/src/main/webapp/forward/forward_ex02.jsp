<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//forward이동
	//RequestDispatcher dp = request.getRequestDispatcher("forward_ex03.jsp");
	//dp.forward(request, response); //request, response를 전달
	
	//리다이렉트이동
	response.sendRedirect("forward_ex03.jsp");
	
	
%>