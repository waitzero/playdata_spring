package com.simple.controller;
import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.simple.command.QuizVO;



@Controller
@RequestMapping("/quiz")
public class QuizController {
	//�솕硫� 異쒕젰
	@RequestMapping("/quiz01")
	public String quiz01() {
		return "quiz/quiz01";
	}
	
	@RequestMapping("/sendBirth")
	public String sendBirth(QuizVO vo, Model model) {
	System.out.println(vo.getYear() + vo.getMonth() + vo.getDay());
		model.addAttribute("vo", vo);
		return "quiz/quiz01_ok";
	}
	//�솕硫�
	@RequestMapping("/quiz02")
	public String quiz02(){
		return "quiz/quiz02";
	}
	@RequestMapping(value="/join", method=RequestMethod.POST)
	public String join (@ModelAttribute("id") String id,
						@ModelAttribute("pw") String pw,
						@ModelAttribute("name") String name,
						@ModelAttribute("email") String email) {
		return "quiz/quiz02_ok";
	}
	//화면
	@RequestMapping("/quiz03")
	public String quiz03() {
			return "quiz/quiz03";
	}
	
	@RequestMapping(value="/join2", method=RequestMethod.POST)
	public String join2 (@ModelAttribute("id") String id,
					     @ModelAttribute("pw") String pw,
					     @ModelAttribute("pw_check") String pw_check,
					     Model model) {
		if(!id.equals(null)) {
			model.addAttribute("아이디를 입력하세요");
			return "quiz/quiz03";
		}else if(!pw.equals(pw_check)) {
			model.addAttribute("비밀번호를 확인해 주세요");
			return "quiz/quiz03";
		}else {
			model.addAttribute(id+"님 회원가입을 축하드립니다.");
			return "quiz/quiz03_ok";
		}
				
	}
			
		
}
	//�솕硫�
