package com.coding404.trip.service;

import java.util.List;

import com.coding404.command.TripVO;
import com.coding404.util.Criteria;

public interface TripMapper {

	public int noticeRegist(TripVO vo); //등록
	//public List<TripVO> getList(); //목록
	public List<TripVO> getList(Criteria cri); //페이지목록
	public int getTotal(Criteria cri); //전체게시글 수
	
	
	public TripVO getDetail(int tno); //상세내용
	public void upHit(int tno); //조회수증가
	public int noticeUpdate(TripVO vo); //업데이트
	public void noticeDelete(int tno); //삭제

	public List<TripVO> getPrevNext(int tno); //이전글다음글
	
}
