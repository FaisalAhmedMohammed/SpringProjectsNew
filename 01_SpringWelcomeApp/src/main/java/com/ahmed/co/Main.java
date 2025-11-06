package com.ahmed.co;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext ctxt = new ClassPathXmlApplicationContext("config.xml");
		/*
		 * WelcomeBean bean = ctxt.getBean(WelcomeBean.class); String welcome =
		 * bean.welcome(); System.out.println(welcome);
		 * 
		 * 
		 */
		Object obj = ctxt.getBean("welcome");
		WelcomeBean bean = (WelcomeBean) obj;
		
		String welcome = bean.welcome();
		System.out.println(welcome);
	}

}
