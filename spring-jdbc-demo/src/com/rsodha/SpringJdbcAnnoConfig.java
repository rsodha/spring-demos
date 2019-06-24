package com.rsodha;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringJdbcAnnoConfig {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringJdbcConfig.class);
		UserDao userDao = context.getBean("userDao", UserDao.class);
		int status = userDao.saveUser(new User(11, "rsodha@gmail.com", "Raghu Sodha"));
		System.out.println(status);
		context.close();
	}
}
