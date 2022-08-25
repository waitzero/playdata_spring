package ex07.quiz;

import org.springframework.beans.factory.annotation.Autowired;

public class MemberController {
	@Autowired	
	private MemberServiceImpl memberService; //1번 다오로 가려고 서비스를 거쳐서, 가면서 또 돌아오려고 써줌
	
	public void helloWorld() {		
		//MVC2 방식의 클래스 모형입니다.
		//1. Controller에서 new키워드를 사용하지 말고 "자동주입"을 이용해서 Service의 hellworld를 호출시켜주세요
		//2. Service에서는   new키워드를 사용하지 말고 "자동주입"을 이용해서 DAO의 helloworld를 호출시켜주세요
		//3. DAO에 있는 리턴값을 Controller로 반환받고 출력해주세요
		//4. main에서는 컨트롤러 객체를 확인
		System.out.println(memberService.helloWorld()); // 4. 서비스에서 받아온 함수를 쓸꺼야.
		
//		String result = memberService.helloWorld();
//		System.out.println(result);
		
		
	}
}
	
	

