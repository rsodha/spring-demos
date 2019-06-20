package spring.core.basics;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main {
	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.setId("1");

		System.out.println("Employee 1: " + e1);

		Resource resource = new ClassPathResource("employeebean.xml");
		BeanFactory factory = new XmlBeanFactory(resource); // Deprecated

		Employee e2 = factory.getBean("e2", Employee.class);

		System.out.println(e2);
	}
}
