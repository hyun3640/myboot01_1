package com.myboot01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication	// 이 클래스가 스프링부트로 만든 애플리케이션의 시작 클래스임을 의미
public class Myboot01Application { //스프링 부트로 만든 애플리케이션을 실행하기 위해서 메인클래스를 작성, 클래스명은 프로젝트이름 + Application.java 형태로 매일 클래스가 작성됨, 별도 메인클래스를 자겅하지 않고 이 프로그램만 작성된다.
									//스프링 부트로 만든 애플리케이션은 일반 자바 애플리케이션으로 실행할 수도 있고 웹 애플리케이션으로 실행할 수도 있다.
	public static void main(String[] args) {
		SpringApplication.run(Myboot01Application.class, args);
	}

}
