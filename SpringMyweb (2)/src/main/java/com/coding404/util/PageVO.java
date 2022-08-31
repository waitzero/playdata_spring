package com.coding404.util;

import lombok.Data;

@Data //getter, setter, toString
public class PageVO {
	
	//화면에 페이지네이션을 그리는 클래스
	private int end; //페이지네이션의 끝번호 
	private int start; //페이지네이션의 시작번호
	private boolean next; //다음버튼 활성화여부
	private boolean prev; //이전버튼 활성화여부
	
	private int realEnd; //실제끝번호	
	
	private int page; //현재 조회하는 페이지
	private int amount; //데이터 개수
	private int total; //전체게시글 수
	
	private Criteria cri; //페이지 기준 클래스
	
	//PageVO는 생성될때 cri클래스와, 전체게시글 수를 매개변수로 받아줍니다.
	public PageVO(Criteria cri, int total) {
		//조회하는 페이지번호, 데이터개수, 전체게시글수, cri값 초기화
		this.page = cri.getPage();
		this.amount = cri.getAmount();
		this.total = total;
		this.cri = cri;
		
		//1. 끝페이지 계산
		//page가 3번이면 -> 페이지번호 10
		//page가 13번이면 -> 페이지번호 20
		//1~10번 페이지 조회 -> 페이지번호 10
		//공식 (int)(Math.ceil(현재조회하는 번호 / 페이지네이션개수) * 페이지네이션 개수
		this.end = (int)(Math.ceil( this.page / 10.0) ) * 10;
		
		//2. 시작페이지 계산
		//공식 end - 페이지네이션 개수 + 1
		this.start = this.end - 10 + 1;
		
		//3. 실제끝번호의 계산
		//데이터가 60개 있다고 가정할 때, 5번페이지 조회 시 end = 6
		//데이터가 112개 있다고 가정할 때, 11번페이지 조회시 end = 12
		//공식 (int)(Math.ceil(전체게시글수 / 데이터개수) 
		this.realEnd = (int)(Math.ceil( this.total / (double)this.amount ) );
		
		//4. 마지막 페이지의 결정
		//데이터가 112개 있다고 가정할 때, 5번페이지 조회시 end = 10, realEnd = 12 ---> 10
		//데이터가 112개 있다고 가정할 때, 11번페이지 조회시 end = 20, realEnd = 12 ---> 12
		this.end = this.end > this.realEnd ? this.realEnd : this.end;
		
		//5. 이전버튼 활성화 여부
		//start페이지가 1, 11, 21, 31, 41...증가되는데 1초과 일때만 활성화
		this.prev = this.start > 1; 
		
		//6. 다음버튼 활성화 여부
		//조건- 진짜끝번호가 현재끝번호 보다 큰 경우에 true
		this.next = this.realEnd > this.end;
				
	}
	
	
	
	
	
}
