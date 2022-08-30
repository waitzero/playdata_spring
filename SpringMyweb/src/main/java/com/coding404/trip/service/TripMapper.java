package com.coding404.trip.service;

import java.util.List;

import com.coding404.command.TripVO;

public interface TripMapper {
	public int noticeRegist(TripVO vo);
	public List<TripVO> getList();
	public TripVO getDetail (int tno);
	public void upHit(int tno);
	public int noticeUpdate (TripVO vo);
	public void noticeDelete(int tno);
}
