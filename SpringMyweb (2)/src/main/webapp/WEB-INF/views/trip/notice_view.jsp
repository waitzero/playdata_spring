<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
	
	<div id="container">
		<!-- location_area -->
		<div class="location_area customer">
			<div class="box_inner">
				<h2 class="tit_page">TOURIST <span class="in">in</span> TOUR</h2>
				<p class="location">고객센터 <span class="path">/</span> 공지사항</p>
				<ul class="page_menu clear">
					<li><a href="#" class="on">공지사항</a></li>
					<li><a href="#">문의하기</a></li>
				</ul>
			</div>
		</div>	
		<!-- //location_area -->

		<!-- 
			1.form태그 생성
			2.a링크 클릭했을때 form태그를 수정 or 삭제 요청으로 제어(js)
			3.수정 화면 or 삭제작업에는 tno값이 필요하기 때문에 hidden을 이용해서 넘겨준다.
		 -->
		<!-- bodytext_area -->
		<form action="" method="post" name="actionForm">
		
			<input type="hidden" name="tno" value="${vo.tno}">
		
			<div class="bodytext_area box_inner">			
				<ul class="bbsview_list">
					<li class="bbs_title">${vo.title}</li>
					<li class="bbs_hit">작성일 : <span>${vo.tripdate}</span></li>
					<li class="bbs_date">작성자 : <span>${vo.writer}</span></li>
					<li class="bbs_content">
						<div class="editer_content">
						    ${vo.content}
	                    </div>
					</li>
				</ul>
				<p class="btn_line txt_right">
					<a href="javascript:;" class="btn_bbs" id="updateBtn" >글수정</a>
					<a href="javascript:;" class="btn_bbs" id="deleteBtn">글삭제</a>
					<a href="notice_list;" class="btn_bbs">목록</a>
				</p>
				<ul class="near_list mt20">
				
					<c:forEach var="data" items="${list}">
					
						<c:if test="${data.tno > vo.tno}">
							<li><h4 class="prev">다음글</h4><a href="notice_view?tno=${data.tno}">${data.title}</a></li>						
						</c:if>
						<c:if test="${data.tno < vo.tno}">
							<li><h4 class="next">이전글</h4><a href="notice_view?tno=${data.tno}">${data.title}</a></li> 				
						</c:if>
					
					</c:forEach>
					
				</ul>
			</div>
		</form>
		<!-- //bodytext_area -->

	</div>
	<!-- //container -->

    <script>
    	var updateBtn = document.getElementById("updateBtn");
    	updateBtn.onclick = function(){
    		event.preventDefault(); // a태그의 기본 이동이벤트를 중지
    		
	    	// 폼태그는 document.폼이름으로 접근
	    	document.actionForm.action = "notice_modify";
	    	document.actionForm.submit(); // 폼을 서브밋
    	}
    	
    	
    	var deleteBtn = document.getElementById("deleteBtn");
    	
    	deleteBtn.onclick = function(){
    		event.preventDefault(); // a태그의 기본 이동이벤트를 중지
    		
    		if(confirm("삭제 하시겠습니까?")){
	    		document.actionForm.action = "deleteForm";
	    		document.actionForm.submit(); // 폼을 서브밋
    		}
    	}
    	
    </script>