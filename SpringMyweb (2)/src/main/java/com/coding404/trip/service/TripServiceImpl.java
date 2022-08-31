package com.coding404.trip.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coding404.command.TripVO;
import com.coding404.util.Criteria;

@Service("tripService")
public class TripServiceImpl implements TripService {
	
	@Autowired
	TripMapper tripMapper;
	
	@Override
	public int noticeRegist(TripVO vo) {
		return tripMapper.noticeRegist(vo);
	}

	@Override
	public List<TripVO> getList(Criteria cri) {
		return tripMapper.getList(cri);
	}
	//전체게시글 수
	@Override
	public int getTotal(Criteria cri) {
		return tripMapper.getTotal(cri);
	}


	@Override
	public TripVO getDetail(int tno) {
		return tripMapper.getDetail(tno);
	}

	@Override
	public void upHit(int tno) {
		tripMapper.upHit(tno);
	}

	@Override
	public int noticeUpdate(TripVO vo) {
		return tripMapper.noticeUpdate(vo);
	}

	@Override
	public void noticeDelete(int tno) {
		tripMapper.noticeDelete(tno);
	}

	@Override
	public List<TripVO> getPrevNext(int tno) {
		return tripMapper.getPrevNext(tno);
	}


}
