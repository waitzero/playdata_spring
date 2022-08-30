<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <title> 박물관 미션 투어 당첨자 발표 | 공지사항 등록 </title>
    <meta name="viewport" content="width=device-width, initial-scale=1, minimum-scale=1, maximum-scale=1">
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge">

    <link rel="stylesheet" href="/myweb/resources/css/common.css">
    <script src="/myweb/resources/js/jquery-1.11.3.min.js"></script>
    <script src="/myweb/resources/js/common.js"></script>  
    <script src="/myweb/resources/js/jquery.smooth-scroll.min.js"></script> 

    <!-- 데이트피커 -->
    <link rel="stylesheet" href="https://code.jquery.com/ui/1.13.2/themes/base/jquery-ui.css">
    <script src="https://code.jquery.com/ui/1.13.2/jquery-ui.js"></script>
    <script>
    $( function() {
        $( "#datepicker_a" ).datepicker();
        $( "#datepicker_a" ).datepicker( "option", "dateFormat", "yy-mm-dd");
    });
    </script>


</head>

<body>

<!-- wrap -->
<div id="wrap">

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
		<div class="bodytext_area box_inner">
			<!-- appForm -->
			<form action="noticeRegist" method="post"class="appForm">
				<fieldset>
					<legend>상담문의 입력 양식</legend>
					<p class="info_pilsoo pilsoo_item">필수입력</p>
					<ul class="app_list">
                        <li class="clear">
                            <label for="email_lbl" class="tit_lbl pilsoo_item">등록일</label>
                            <div class="app_content email_area">
                            <!--required, pattern속성을 사용할 때는 form태그를 반드시 submit버튼 으로 전송해야 동작됩니다.  -->
                                <input type="text" name="tripdate" id="datepicker_a" placeholder="날짜를 선택하세요" required="required" pattern="[0-9]{4}-[0-9]{2}-[0-9]{2}">
                            </div>
						</li>
						
						<li class="clear">
                            <label for="email_lbl" class="tit_lbl pilsoo_item">작성자</label>
                            <div class="app_content email_area">
								<input type="hidden" />
                                <input type="text"name="writer" placeholder="작성자"required="required"/>

                            </div>
						</li>
						<li class="clear">
							<label for="name_lbl" class="tit_lbl pilsoo_item">제목</label>
							<div class="app_content">
							<input type="text" name="title"class="w100p" id="name_lbl" placeholder="제목을 입력하세요"required="required"/></div>
						</li>


						<li class="clear">
							<label for="content_lbl" class="tit_lbl">문의내용</label>
							<div class="app_content">
							<textarea name="content" id="content_lbl" class="w100p" placeholder="간단한 상담 요청 사항을 남겨주시면 보다 상세한 상담이 가능합니다.
전화 상담 희망시 기재 부탁드립니다."></textarea></div>
						</li>
					</ul>
					<p class="btn_line">
                      <!--   <a href="javascript:;" class="btn_baseColor">글작성</a>
                        <a href="javascript:;" class="btn_baseColor">목록</a> -->


						<input type="submit" class="btn-baseColor" value="글작성">
						<input type="button" class="btn-baseColor" value="목록">
                    </p>	
				</fieldset>
			</form>
			<!-- //appForm -->
			
		</div>
		<!-- //bodytext_area -->

	</div>
	<!-- //container -->

</body>
</html>
