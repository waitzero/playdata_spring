package com.coding404.trip.service;

import java.util.List;

import com.coding404.command.TripVO;

public interface TripService {
	public int noticeRegist(TripVO vo);//등록
	public List<TripVO> getList();
	public TripVO getDetail (int tno);
	public void upHit(int tno);
	public int noticeUpdate (TripVO vo);//업데이트
	public void noticeDelete(int tno);
}
