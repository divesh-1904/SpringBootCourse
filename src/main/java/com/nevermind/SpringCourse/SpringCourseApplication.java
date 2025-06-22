package com.nevermind.SpringCourse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringCourseApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(SpringCourseApplication.class, args);
		Dev dev = context.getBean(Dev.class);
		dev.setContext(context);
		dev.build();
	}

}
