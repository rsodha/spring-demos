package com.rsodha;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringJdbc {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		UserDao userDao = context.getBean("udao", UserDao.class);
		int status = userDao.saveUser(new User(10, "rsodha@gmail.com", "Raghu Sodha"));
		System.out.println(status);
		((ClassPathXmlApplicationContext) context).close();
	}
}