package ex01;

import org.springframework.context.support.GenericXmlApplicationContext;

import ex02.Chef;
import ex02.Hotel;
import ex03.DatabaseDev;
import ex03.MemberDao;
import ex04.quiz.Car;

public class MainClass {

	public static void main(String[] args) {
		
		//SpringTest s = new SpringTest();
		//s.helloWorld();
		
		GenericXmlApplicationContext ctx =
				new GenericXmlApplicationContext("application-context.xml");
		
//		//getBean(id)
//		SpringTest s = (SpringTest)ctx.getBean("s");
//		s.helloWorld();
//		
//		//getBean(클래스의정보) - 리플렉션기법
//		SpringTest s2 = ctx.getBean(SpringTest.class);
//		s2.helloWorld();
		
//		Hotel h = (Hotel)ctx.getBean("b"); //hotel클래스
//		Chef c = h.getChef();
//		c.cooking();
		
		DatabaseDev dev = (DatabaseDev)ctx.getBean("d");
		System.out.println(dev.getUid());
		System.out.println(dev.getUpw());
		System.out.println(dev.getUrl());
		
//		MemberDAO dao = (MemberDAO)ctx.getBean("dao");
//		DatabaseDev d = dao.getDev();
//		System.out.println(d.getUid());
//		System.out.println(d.getUpw());
//		System.out.println(d.getUrl());
		
		
		//Car클래스에 Battery1을 의존주입
		//힌트: 인터페이스는 빈생성이 안됩니다.
		
//		
//		Car car = (Car)ctx.getBean("car");
//		car.getBattery().energy();
//		
//		Car car2 = (Car)ctx.getBean("car");
//		car2.getBattery().energy();
//		
//		
//		System.out.println(car == car2);
		
		
		
		
		
		
		
		
		
	}
}
