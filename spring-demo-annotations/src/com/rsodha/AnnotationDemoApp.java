package com.rsodha;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationDemoApp {
	public static void main(String[] args) {
		// ClassPathXmlApplicationContext context = new
		// ClassPathXmlApplicationContext("ApplicationContext.xml");
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		Coach coach = context.getBean("swimCoach", Coach.class);
		System.out.println(coach.getWO());
		System.out.println(coach.getFn());
		context.close();
	}
}
