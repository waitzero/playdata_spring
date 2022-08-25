package com.simple.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.simple.command.ScoreVO;
import com.simple.service.ScoreService;
import com.simple.service.ScoreServiceImpl;

@Controller
@RequestMapping("/service")
public class ServiceController {
//	멤버변수
	@Autowired
	@Qualifier("xxx")// 강제로 xxx bean연결
	private ScoreService scoreService;
	//화면
	@RequestMapping("/scoreList")
	public String scoreList() {
		return "service/scoreList";
	}
	@RequestMapping("/scoreRegist")
	public String scoreRegist() {
		return "service/scoreRegist";
	}
	@RequestMapping("/scoreResult")
	public String scoreResult() {
		return "service/scoreResult";
	}
	//폼요청
	@RequestMapping("/scoreForm")
	public String scoreForm(ScoreVO vo) {
//		System.out.println(vo.toString());
		
//		//1st-고전적인 방법
//		ScoreServiceImpl service = new ScoreServiceImpl();
//		service.scoreRegist(vo);
		
		//2st-bean으로 생성하고 @autowired
		scoreService.scoreRegist(vo);
		return "redirect:/service/scoreResult";
	}
	
}
