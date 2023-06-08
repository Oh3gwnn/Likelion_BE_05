package com.example.mvc.temp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Demo2Application {

	public static void main(String[] args) {
		// 현재 실행 중인 IoC Container 반환
		// -> IoC Container는 클래스를 객체로 만들어 내부 관리
		ApplicationContext applicationContext = SpringApplication.run(Demo2Application.class, args);

		// Container가 Bean 객체를 가지고 있는지 확인
		for (String beanName: applicationContext.getBeanDefinitionNames()) {
			System.out.println(beanName);
		}
	}

}
