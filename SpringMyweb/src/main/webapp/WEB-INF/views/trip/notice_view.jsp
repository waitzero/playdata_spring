<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<title> 박물관 미션 투어 당첨자 발표 | 공지사항 | 고객센터 | 투어리스트인투어 </title>
<meta name="viewport" content="width=device-width, initial-scale=1, minimum-scale=1, maximum-scale=1">
<meta charset="utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<link rel="stylesheet" href="/myweb/resources/css/common.css">
<script src="/myweb/resources/js/jquery-1.11.3.min.js"></script>
<script src="/myweb/resources/js/common.js"></script>  
<script src="/myweb/resources/js/jquery.smooth-scroll.min.js"></script> 

</head>

<body>

	
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

		<!-- bodytext_area -->
		<!-- 1.form태그생성
			 2.a링크 클릭했을 때 form태그를 수정 or 삭제 요청으로 제어	
			 3.수정화면 or 삭제작업에는 tno 값이 필요하기 때문에 hidden을 이용해서 tno를 넘긴다. -->
		<form action="" method="post" name="actionForm">
		<input type="hidden" name="tno" value="${vo.tno }">
		<div class="bodytext_area box_inner">			
			<ul class="bbsview_list">
				<li class="bbs_title">${vo.title }</li>
				<li class="bbs_hit">작성일 : <span>${vo.tripdate }</span></li>
				<li class="bbs_date">작성자 : <span>${vo.writer }</span></li>
				<li class="bbs_content">
					<div class="editer_content">
					    ${vo.content }
                    </div>
				</li>
			</ul>
			<p class="btn_line txt_right">
				<a href="/trip/notice_modify" class="btn_bbs" id="updateBtn">글수정</a>
				<a href="#" class="btn_bbs" id="deleteBtn">글삭제</a>
				<a href="notice_list" class="btn_bbs" >목록</a>
			</p>
			<ul class="near_list mt20">
				<li><h4 class="prev">다음글</h4><a href="javascript:;">추석 연휴 티켓/투어 배송 및 직접 수령 안내</a></li>		
				<li><h4 class="next">이전글</h4><a href="javascript:;">이번 여름 휴가 제주 갈까? 미션 투어 (여행경비 50만원 지원)</a></li>
			</ul>
		</div>
		</form>
		<!-- //bodytext_area -->

	</div>
	<!-- //container -->

<script>
var updateBtn = document.getElementById("updateBtn");
updateBtn.onclick = function() {
	event.preventDefault();//a태그의 기본 이동 이벤트 중지
	//폼태그는 document.폼이름 으로 접근
	document.actionForm.action= "/notice_modify";
	document.actionForm.submit();//폼을 서브밋 	
}
var deleteBtn = document.getElementById("deleteBtn");
deleteBtn.onclick = function() {
	event.preventDefault();//a태그의 기본 이동 이벤트 중지
	//폼태그는 document.폼이름 으로 접근
	if(confirm("삭제하시겠습니까")){
		document.actionForm.action= "deleteForm";
		document.actionForm.submit();//폼을 서브밋 	
	}
}
</script>


    