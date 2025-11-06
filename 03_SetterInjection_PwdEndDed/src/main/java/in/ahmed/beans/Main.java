package in.ahmed.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

		Object bean = context.getBean("user");
		UserService service = (UserService) bean;

		service.SaveUser("ashok", "12345");
		
		service.fetchUser("ahmed");

	}

}
