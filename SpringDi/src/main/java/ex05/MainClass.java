package ex05;

import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import ex06.quiz.Computer;
import ex07.quiz.MemberController;

public class MainClass {

	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("autowired-context.xml");
		
//		Printer pt = (Printer)ctx.getBean("printer");
//		String data = pt.getDoc().getData();
//		System.out.println(data);
		
		// 3번
		// Computer 에 키보드, 모니터, 마우스를 @Autowired 로 주입.
		// 메인에서는 Computer bean 으로 얻어서 확인.
		
//		Computer com = (Computer)ctx.getBean("computer");
//		com.computerInfo();
		
		MemberController con = (MemberController)ctx.getBean("controller");
		con.helloWorld();
		
		
		
	}

}
