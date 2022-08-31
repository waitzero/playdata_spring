package com.coding404.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.coding404.command.TripVO;
import com.coding404.trip.service.TripService;
import com.coding404.util.Criteria;
import com.coding404.util.PageVO;

@Controller
@RequestMapping("/trip")
public class NoticeController {
	
	
	@Autowired
	@Qualifier("tripService")
	TripService tripService;

	//목록화면
	@RequestMapping("/notice_list")
	public String notice_list(Model model,
							  Criteria cri) { //화면에서 page, amount를 전달
		
		
		
		//조회
		List<TripVO> list = tripService.getList(cri);
		//PageVO생성
		int total = tripService.getTotal(cri); //전체게시글수
		PageVO pageVO = new PageVO(cri, total);
		
		model.addAttribute("list", list); 
		model.addAttribute("pageVO", pageVO);
		
		
		
		return "trip/notice_list";
	}
	
	//내용화면
	@RequestMapping("/notice_view")
	public String notice_view(@RequestParam("tno") int tno,
							  Model model) {
		
		/*
		 * 1. mapper의 getDetail을 호출합니다.
		 * 2. 조회된 구문을 model에 vo이름으로 담아주세요.
		 * 3. 화면에서 적합한 위치에 vo값을 출력해주세요.
		 */
		TripVO vo = tripService.getDetail(tno);
		model.addAttribute("vo", vo);
		//조회수 
		tripService.upHit(tno);
		
		//이전글, 다음글
		List<TripVO> list = tripService.getPrevNext(tno);
		model.addAttribute("list", list);
		
		System.out.println(list.toString());
		
		
		
		
		
		
		return "trip/notice_view";
	}
	
	//등록화면
	@RequestMapping("/notice_write")
	public String notice_write() {
		return "trip/notice_write";
	}
	
	//등록폼
	@RequestMapping("/noticeRegist")
	public String noticeRegist(TripVO vo, RedirectAttributes RA) {
		
		
		int result = tripService.noticeRegist(vo);
		
		String msg = result == 1 ? "문의사항 등록이 정상 처리되었습니다" : "문의 등록에 실패했습니다";
		RA.addFlashAttribute("msg", msg); //리다이렉트 어트리뷰트에 데이터 저장
		
		
		
		return "redirect:/trip/notice_list"; //목록 컨트롤러를 태워서 나감
	}
	
	//수정화면 (POST방식만 허용)
	@RequestMapping(value="/notice_modify", method=RequestMethod.POST)
	public String notice_modify(@RequestParam("tno") int tno,
								Model model) {
		
		//tno를 가지고 
		TripVO vo = tripService.getDetail(tno);
		model.addAttribute("vo", vo);
		
		return "trip/notice_modify";
	}
	
	//수정폼
	@RequestMapping("/noticeUpdate")
	public String noticeUpdate(TripVO vo, RedirectAttributes RA) {
		/*
		 * 1. 화면에서 넘어오는 데이터를 vo를 통해서 받으세요 
		 * 2. service, mapper에 noticeUpdate메서드를 만들고 update작업을 수행합니다. (등록일, 제목, 내용)
		 * 3. 업데이트가 성공하면 목록화면으로 리다이렉트 시킵니다.
		 *    msg변수를 이용해서 "글 수정에 성공했습니다" 메시지를 출력해주세요.
		 *    public int noticeUpdate(TripVO vo)   
		 */
		int result = tripService.noticeUpdate(vo);
		String msg = result == 1 ? "글 수정에 성공했습니다" : "수정 실패";
		RA.addFlashAttribute("msg", msg); //1회성 메시지
		
		return "redirect:/trip/notice_list";
	}
	
	@RequestMapping("/deleteForm")
	public String deleteForm(@RequestParam("tno") int tno) {

		tripService.noticeDelete(tno);
		
		return "redirect:/trip/notice_list"; 
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
