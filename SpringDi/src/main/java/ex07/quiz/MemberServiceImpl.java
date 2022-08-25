package ex07.quiz;

import org.springframework.beans.factory.annotation.Autowired;

public class MemberServiceImpl {
	@Autowired
	private MemberDAO memberDAO; // 2,dao 에 연결하려고, 받아서 돌아오려고
	
	public String helloWorld() {
		//DAO의 helloworld메서드를 호출시키고 반환해주세요
		return memberDAO.helloWorld(); // 3. dao 에 있는 함수를 쓰자.
		
//		String result = memberDAO.helloWorld();
//		return result;
	}
	
}