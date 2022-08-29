package com.simple.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.simple.command.ScoreVO;
import com.simple.service.ScoreService;
import com.simple.service.ScoreServiceImpl;

@Controller
@RequestMapping("/service")
public class ServiceController {
	
	//멤버변수
	@Autowired //bean을 타입->이름 주입
	@Qualifier("scoreService")
	private ScoreService scoreService;
	
	
	//화면
	@RequestMapping("/scoreList")
	public String scoreList(Model model) {
		
		//select
		List<ScoreVO> list = scoreService.getList();
		model.addAttribute("list", list);
		
		
		
		return "service/scoreList";
	}
	
	
	
	//화면
	@RequestMapping("/scoreRegist")
	public String scoreRegist() {
		return "service/scoreRegist";
	}
	
	//화면
	@RequestMapping("/scoreResult")
	public String scoreResult() {
		return "service/scoreResult";
	}
	
	//폼요청
	@RequestMapping("/scoreForm")
	public String scoreForm(ScoreVO vo) {
		//등록...
		
		//1st - 고전적인 방법
//		ScoreService service = new ScoreServiceImpl();
//		service.scoreRegist(vo);
		
		//2nd - bean으로 생성하고 @autowired
		scoreService.scoreRegist(vo);
		
		
		
		return "redirect:/service/scoreResult";
	}
	
	//삭제기능 - 화면에서 삭제에 대한 키값이 전달되야 합니다.
	@RequestMapping("/scoreDelete")
	public String scoreDelete(@RequestParam("num") int num) {
		
		scoreService.scoreDelete(num);

		
		return "redirect:/service/scoreList"; //컨트롤러를 태워나감
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
