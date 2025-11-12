package in.ahmed.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext("in.ahmed.beans");

		SampleClass bean = context.getBean(SampleClass.class);
		String gwtUrl = bean.gwtUrl();

		System.out.println(gwtUrl);

	}
}
