package com.ahmed.co;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		Object bean = context.getBean("mLister");
		MovieLister	 lister = (MovieLister) bean;// down casting 
		lister.showMovies(2024);

	}

}
