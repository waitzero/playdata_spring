package ex05;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Printer {
	// Autowired - IOC 에서 주입될 수 있는 빈은 타입 -> 이름으로 찾아서 주입
	// 생성자, 세터, 심지어 멤버변수에도 쓸수 있다.
	@Autowired
	@Qualifier("doc1")
	private Document doc;
	
	// 멤버변수 주입을 주려면 기본생성자가 반드시 있어야 합니다.
	private Printer() {
		
	}
	
	// 생성자
	public Printer(Document doc) {
		this.doc = doc;
	}
	// getter, setter
	public Document getDoc() {
		return doc;
	}

	public void setDoc(Document doc) {
		this.doc = doc;
	}
	
	
	
}
