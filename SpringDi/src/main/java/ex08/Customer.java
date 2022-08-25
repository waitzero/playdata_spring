package ex08;

import java.util.List;
import java.util.Map;

public class Customer {

	// 멤버변수로 컬렉션을 가진다.
	// xml 에 list 와 map 값을 의존주입 시키도록 표현
	private List<String> lists;
	private Map<String, Object> maps;
	
	
	public List<String> getLists() {
		return lists;
	}
	
	public void setLists(List<String> lists) {
		this.lists = lists;
	}
	
	public Map<String, Object> getMaps() {
		return maps;
	}
	
	public void setMaps(Map<String, Object> maps) {
		this.maps = maps;
	}
	
	
	
	
	
	
	
}
