package com.simple.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.simple.command.Quiz01VO;

@Controller
@RequestMapping("/quiz")
public class QuizController {
	//화면출력
	@RequestMapping("/quiz01")
	public String quiz01() {
		return "quiz/quiz01";
	}
	
	@RequestMapping("/sendBirth")
	public String sendBirth(Quiz01VO vo, Model model) {
		
		System.out.println(vo.getYear() + vo.getMonth() + vo.getDay());
		model.addAttribute("vo", vo);
		
		return "quiz/quiz01_ok";
	}
	
	//화면
	@RequestMapping("/quiz02")
	public String quiz02() {
		
		return "quiz/quiz02";
	}
	
	
	//값을 받고, 다음화면으로 그대로 들고 나감
	@RequestMapping(value = "/join" , method=RequestMethod.POST)
	public String join(@ModelAttribute("id") String id,
					   @ModelAttribute("pw") String pw,
					   @ModelAttribute("name") String name,
					   @ModelAttribute("email") String email) {
		
		
		return "quiz/quiz02_ok";
	}
	
	
	
	
	
	
	
	
	
	
	
}
