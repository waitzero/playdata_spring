package com.simple.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.core.style.DefaultValueStyler;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/request")//해당 컨트롤러를 구분할때 사용
public class RequestController {

//	
//	@RequestMapping(value = "/req_ex01", method = RequestMethod.GET)
//	public String req_ex01() {
//		return "request/req_ex01";
//	}
//	//get, post둘다 허용
//	@RequestMapping("/basic1")
//	public String basic1() {
//		System.out.println("basic1번 실행됨");
//		return null;//화면에 대한 경로
//	}
//	//post만 허용
//	@RequestMapping(value="/req_ex02", method=RequestMethod.POST)
//	public String basic2() {	
//		System.out.println("basic2번 실행됨");
//		return null;
//	}
//	//동일한 형식의 요청이라면 묶어서 사용이 가능합니다.
//	@RequestMapping({"/basic3", "/basic4"})
//	public String basic3_4() {
//		System.out.println("요청을 묶어서 사용");
//		
//   return null;
//	}
//	
//	@RequestMapping("/req_ex02")
//	public void req_ex() {
//	}
//	
//	@RequestMapping("/param1")
//	public String param(HttpServletRequest request) {
//		String id =request.getParameter("id");
//		String pw =request.getParameter("pw");
//		String[] inter = request.getParameterValues("inter");
//		
//		System.out.println(id);
//		System.out.println(pw);
//		return "request/req_ex02_result";
//	}
//	//데이터를 받는방법
//	@RequestMapping("/param1")
//	public String param(@RequestParam("id") String id,
//						@RequestParam("pw") String pw,
//						@RequestParam("inter") List<String> list,
//						@RequestParam(value="age", required = false, defaultValue= "0") int age) {
//		//리퀘스트파람은 화면에서 데이터를 필수로 전송해야 합니다.
//		//필수가 아닌 파라미터는 null값을 지정하게 되는데, 기본값의 설정으로 defaultvalue옵션을 사용하면 된다.
//		
//		System.out.println(id);
//		System.out.println(pw);
//		System.out.println(list.toString());
//		
//		return "request/req_ex02_result";
//	}
//	@RequestMapping("/param1")
//	public String param() {
//		return "request/req_ex02_result";
//	}
	@RequestMapping("/req_quiz01")
	public String main() {
		return "request/req_quiz01";
	}
	@RequestMapping("/request/login")
	public String login(@RequestParam("id") String id,
						@RequestParam("pw") String pw){
		if(id.equals("abc123") && pw.equals("xxx123")){
		return "request/request_quiz01_ok";
	}else {
		return "request/request_quiz01_no";
	}
		
	
	}
	
	
	
}
