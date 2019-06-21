package spring.core.basics;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		Employee e1 = new Employee("1");

		ApplicationContext context = new ClassPathXmlApplicationContext("employeebean.xml");
		Employee e2 = context.getBean("2", Employee.class);

		System.out.println(e2);
	}
}
