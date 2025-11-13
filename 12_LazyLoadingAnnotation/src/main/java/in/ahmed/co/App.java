package in.ahmed.co;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.ahmed.co.config.AppConfig;

public class App {
	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		//RemunatorLoading loading = context.getBean(RemunatorLoading.class);
		
		

	}
}
