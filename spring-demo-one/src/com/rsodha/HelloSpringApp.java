package com.rsodha;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Coach coach = context.getBean("myCoach-baseball", BaseBallCoach.class);
		// System.out.println(coach.getDailyWorkout());
		// System.out.println(coach.getDailyFortune());

		Coach coach2 = context.getBean("myCoach-baseball", BaseBallCoach.class);
		System.out.println(coach == coach2);
		System.out.println(coach);
		System.out.println(coach2);

		context.close();
	}
}
