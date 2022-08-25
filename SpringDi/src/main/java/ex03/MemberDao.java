package ex03;

public class MemberDao {

	//DAO에 데이터베이스 정보 의존주입
	private DatabaseDev dev;

	public DatabaseDev getDev() {
		return dev;
	}

	public void setDev(DatabaseDev dev) {
		this.dev = dev;
	}
	
	//세터 주입
	
	
}
