package ex06.quiz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
// 2번
public class Computer {
	@Autowired
	@Qualifier("mouse") // autowired 에 있는 mouse 이름 // 클래스가 같으나 아이디가 다를때 사용하자 
	private Mouse mouse;
	@Autowired
	@Qualifier("keyboard")
	private Keyboard kb;
	@Autowired
	@Qualifier("monitor")
	private Monitor monitor;
	
	public void computerInfo() {
		System.out.println("***컴퓨터 정보***");
		mouse.info();
		kb.info();
		monitor.info();
	}
	
}
