
package in.ahmed.co.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.ahmed.co.config.AppConfig;

public class Main {
	public static void main(String[] args) {

		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

		EmailService emailService = ctx.getBean(EmailService.class);

		emailService.sendMail();
		System.out.println("========================");

		DatabaseProperties dbRepository = ctx.getBean(DatabaseProperties.class);
		dbRepository.show();
	}

}
