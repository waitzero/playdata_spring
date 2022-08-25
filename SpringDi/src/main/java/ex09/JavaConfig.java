package ex09;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import ex01.SpringTest;
import ex02.Chef;
import ex02.Hotel;
import ex03.DatabaseDev;
import ex03.MemberDao;

@Configuration //자바클래스를 스프링 설정파일(xml)을 대신해서 사용함
public class JavaConfig {
	
	//<bean id="s" class="ex01.SpringTest" ></bean>
	@Bean 
	public SpringTest s() {
		return new SpringTest();
	}

	/*
	<bean id="a" class="ex02.Chef" />
	<bean id="b" class="ex02.Hotel">
		<constructor-arg ref="a" />
	</bean>
	 */
	
	@Bean
	public Chef a() {
		return new Chef();
	}
	@Bean
	public Hotel b() {
		return new Hotel(a());
	}
	
	/*
	<bean id="d" class="ex03.DatabaseDev">
		<property name="url" value="jdbc:mysql://localhost:3306/spring" />
		<property name="uid" value="spring" />
		<property name="upw" value="spring" />
	</bean>
	*/
	
	@Bean
	public DatabaseDev d() {
		DatabaseDev dev = new DatabaseDev();
		dev.setUrl("jdbc:mysql://localhost:3306/spring");
		dev.setUid("spring");
		dev.setUpw("spring");
		return dev;
	}
	
	/*
	<bean id="dao" class="ex03.MemberDAO">
		<property name="dev" ref="d" />
	</bean>
	*/
	@Bean
	public MemberDao dao() { // This method must return a result of type MemberDao 밑에 안만들어서 생기는 오류
		MemberDao dao = new MemberDao();
		dao.setDev(d()); //
		return dao;
	}
	
	
	
}
