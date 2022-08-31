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

		<!-- bodytext_area -->
		<div class="bodytext_area box_inner">
			<!--  
			검색에 대한 처리
			1. form태그를 이용해서 검색키워드와 검색값을 notice_list에 전달
			2. criteria클래스에서 검색키워드, 검색값, page, amount 값을 받습니다. 
			3. 동적쿼리를 이용해서 sql문 변경
			4. 페이지번호를 클릭할때도 검색 키워드, 검색값을 전달
			5. 검색키워드의 값 유지
			6. 데이터개수가 변경될때도 form을 이용해서 전송하도록 변경 
			
			-->
			
			
			<form action="notice_list" class="minisrch_form" name="actionForm">
				
				<fieldset>
					<select id="handleAmount" style="height: 35px;">
						<option value="10"  ${pageVO.amount == 10 ? 'selected' : '' }>10개씩보기</option>
						<option value="20"  ${pageVO.amount == 20 ? 'selected' : '' }>20개씩보기</option>
						<option value="50"  ${pageVO.amount == 50 ? 'selected' : '' }>50개씩보기</option>
						<option value="100" ${pageVO.amount == 100 ? 'selected' : '' }>100개씩보기</option>
					</select>
					
					<select name="searchType" style="height: 35px;">
						<option value="title" ${pageVO.cri.searchType == 'title' ? 'selected' : '' }>제목</option>
						<option value="content" ${pageVO.cri.searchType == 'content' ? 'selected' : '' }>내용</option>
						<option value="writer" ${pageVO.cri.searchType == 'writer' ? 'selected' : '' }>작성자</option>
						<option value="titcont" ${pageVO.cri.searchType == 'titcont' ? 'selected' : '' }>제목+내용</option>
						<option value="titcontwri" ${pageVO.cri.searchType == 'titcontwri' ? 'selected' : '' }>제목+내용+작성자</option>
					</select>
					<legend>검색</legend>
					
					<input type="text" name="searchKey" value="${pageVO.cri.searchKey}" class="tbox" title="검색어를 입력해주세요" placeholder="검색어를 입력해주세요">
					<input type="submit" class="btn_srch" value="검색">
					
					<input type="hidden" name="page"   value="1">
					<input type="hidden" name="amount" value="${pageVO.amount }">
					
					<!-- 
					<a href="javascript:;" class="btn_srch">검색</a>
					-->
					
				</fieldset>
			</form>
			
			
			<table class="bbsListTbl" summary="번호,제목,조회수,작성일 등을 제공하는 표">
				<caption class="hdd">공지사항  목록</caption>
				<thead>
					<tr>
						<th scope="col">번호</th>
						<th scope="col">제목</th>
						<th scope="col">조회수</th>
						<th scope="col">작성일</th>
					</tr>
				</thead>
				<tbody>
					
					<c:forEach var="vo" items="${list }" varStatus="status">
					<tr>
						<td>${status.count }</td>
						<td class="tit_notice"><a href="notice_view?tno=${vo.tno }">${vo.title }</a> </td>
						<td>${vo.hit }</td>
						<td>${vo.tripdate }</td>
					</tr>
					</c:forEach>
					
				</tbody>
			</table>

			<!-- pagination -->
			<div class="pagination">
				
				<a href="notice_list?page=1&amount=${pageVO.amount }&searchType=${pageVO.cri.searchType}&searchKey=${pageVO.cri.searchKey}" class="firstpage  pbtn"><img src="${pageContext.request.contextPath }/resources/img/btn_firstpage.png" alt="첫 페이지로 이동"></a>
				
				<c:if test="${pageVO.prev }">
				<a href="notice_list?page=${pageVO.start - 1 }&amount=${pageVO.amount }&searchType=${pageVO.cri.searchType}&searchKey=${pageVO.cri.searchKey}" class="prevpage  pbtn"><img src="${pageContext.request.contextPath }/resources/img/btn_prevpage.png" alt="이전 페이지로 이동"></a>
				</c:if>
				
				<c:forEach var="num" begin="${pageVO.start }" end="${pageVO.end }">
				<a href="notice_list?page=${num }&amount=${pageVO.amount}&searchType=${pageVO.cri.searchType}&searchKey=${pageVO.cri.searchKey}"><span class="pagenum ${pageVO.page eq num ? 'currentpage' : '' }">${num }</span></a>
				</c:forEach>
				
				<c:if test="${pageVO.next }">
				<a href="notice_list?page=${pageVO.end + 1 }&amount=${pageVO.amount }&searchType=${pageVO.cri.searchType}&searchKey=${pageVO.cri.searchKey}" class="nextpage  pbtn"><img src="${pageContext.request.contextPath }/resources/img/btn_nextpage.png" alt="다음 페이지로 이동"></a>
				</c:if>
				
				<a href="notice_list?page=${pageVO.realEnd }&amount=${pageVO.amount }&searchType=${pageVO.cri.searchType}&searchKey=${pageVO.cri.searchKey}" class="lastpage  pbtn"><img src="${pageContext.request.contextPath }/resources/img/btn_lastpage.png" alt="마지막 페이지로 이동"></a>
			</div>
			
			
			<!-- //pagination -->
			
		</div>
		<!-- //bodytext_area -->

	</div>
	<!-- //container -->
	
	<script>
		var msg = '${msg}';
		if(msg != '') {
			alert(msg);
		}
		
		//select태그에 이벤트
		var handleAmount = document.getElementById("handleAmount"); 
		handleAmount.onchange = function() {
			//console.log(this); //이벤트에서 this는 태그 자신을 의미함
			//console.log(this.value)
			
			//컨트롤러의 notice_list에 page와 amount를 넘긴다
	//		location.href = "notice_list?page=1&amount=" + this.value;			    
			document.actionForm.amount.value = this.value;
			document.actionForm.submit();
			
		}
		
		
	</script>
	
	
	
	
	
	
	
	
