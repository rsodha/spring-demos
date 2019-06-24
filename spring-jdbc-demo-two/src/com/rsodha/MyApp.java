package com.rsodha;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApp {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		UserDao userDao = context.getBean("userDao", UserDao.class);
		userDao.findAll();
		for (User user : userDao.findAll()) {
			System.out.println(user);
		}
		context.close();
	}
}
