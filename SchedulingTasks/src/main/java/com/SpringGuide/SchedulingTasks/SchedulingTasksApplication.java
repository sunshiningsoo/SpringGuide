package com.SpringGuide.SchedulingTasks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling // background task executor를 생성해준다. 생성되지 않는다면, 아무것도 scheduling 되지 않음
public class SchedulingTasksApplication {

	public static void main(String[] args) {
		SpringApplication.run(SchedulingTasksApplication.class, args);
	}

}
