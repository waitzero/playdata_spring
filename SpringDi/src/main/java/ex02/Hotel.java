package ex02;
// 호텔은 쉐프한테 의존적이다.
public class Hotel {
	// hotel 생성될 당시에 chef를 반드시 주입받는다.
	// 멤버변수, 생성자, 메서드
	private Chef chef;
	public Hotel(Chef chef) {
		this.chef = chef;
	}
	
	//getter
	public Chef getChef() {
		return chef;
	}
	
}