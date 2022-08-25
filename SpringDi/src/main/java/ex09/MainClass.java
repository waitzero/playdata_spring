package ex09;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import ex03.DatabaseDev;

public class MainClass {

	public static void main(String[] args) {
		//Java 설정 빈 확인
		AnnotationConfigApplicationContext ctx =
				new AnnotationConfigApplicationContext(JavaConfig.class);
		
		DatabaseDev dev = ctx.getBean(DatabaseDev.class);
		System.out.println(dev.getUrl() );
		System.out.println(dev.getUid() );
		System.out.println(dev.getUpw() );
		
		System.out.println( "빈의 개수: " + ctx.getBeanDefinitionCount() );
		
	}

}
