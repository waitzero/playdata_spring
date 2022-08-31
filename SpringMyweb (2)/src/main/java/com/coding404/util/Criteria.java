package com.coding404.util;

import lombok.Data;

@Data //getter, setter, toString
public class Criteria {

	private int page; //조회하는페이지번호
	private int amount; //조회하는데이터개수
	
	// 검색키워드 추가작성 1
	private String searchType;
	private String searchKey;

	//페이지번호가 넘어오지 않는경우 기본값
	public Criteria() {
		this(1, 10);
	}
	
	//페이지번호가 넘어오는 경우 
	public Criteria(int page, int amount) {
		this.page = page;
		this.amount = amount;
	}
	
	//limit구문의 첫번째 값에 전달될 getter
	public int getPageStart() {
		return (page - 1) * amount;
	}
	
	
	
}
