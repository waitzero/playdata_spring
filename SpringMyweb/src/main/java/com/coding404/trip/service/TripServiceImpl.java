package com.coding404.trip.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coding404.command.TripVO;

@Service("tripService")
public class TripServiceImpl implements TripService{
		
	@Autowired
	TripMapper tripMapper;

	@Override
	public int noticeRegist(TripVO vo) {
		return tripMapper.noticeRegist(vo);
	}

	@Override
	public List<TripVO> getList() {
		// TODO Auto-generated method stub
		return tripMapper.getList();
	}

	@Override
	public TripVO getDetail(int tno) {
		return tripMapper.getDetail(tno);
	}

	@Override
	public void upHit(int tno) {
		tripMapper.getDetail(tno);
		
	}

	@Override
	public int noticeUpdate(TripVO vo) {

		return tripMapper.noticeUpdate(vo);
	}

	@Override
	public void noticeDelete(int tno) {
		// TODO Auto-generated method stub
		
	}

}
