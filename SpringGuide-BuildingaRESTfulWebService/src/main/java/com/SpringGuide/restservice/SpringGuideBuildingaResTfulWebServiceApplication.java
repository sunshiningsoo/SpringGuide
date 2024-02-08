package com.SpringGuide.restservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
// @Configuration: application context에 bean definition이 있는 class tag
// @EnableAutoConfigration: Springboot에게 classoath setting + other beans 추가하라는 설정 like DispatcherServlet

public class SpringGuideBuildingaResTfulWebServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringGuideBuildingaResTfulWebServiceApplication.class, args);
	}

}
