package in.ahmed.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		Object object = context.getBean("sa");
		ServiceA serivceA = (ServiceA) object;

		serivceA.m1();
		serivceA.m2();
	}

}
