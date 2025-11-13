package in.ahmed.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.ahmed.beans.config.AppConfig;

public class Main {
	public static void main(String[] args) {

		@SuppressWarnings({ "unused", "resource" })
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
	}

}
