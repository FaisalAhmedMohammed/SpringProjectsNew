package in.ahmed.Main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ahmed.beans.ServiceA;

public class Main {// this is client application which invokes/method of bean class
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		ServiceA bean = context.getBean(ServiceA.class);
		bean.printMessage();
		context.close();
	}

}
