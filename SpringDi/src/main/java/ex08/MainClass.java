package ex08;

import java.util.List;
import java.util.Map;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("collection-context.xml");
		
		Customer cus = (Customer)ctx.getBean("cus");
		
		List<String> list = cus.getLists();
		Map<String, Object> map = cus.getMaps();
		
		System.out.println(list.toString());
		System.out.println(map.toString());
	}

}
