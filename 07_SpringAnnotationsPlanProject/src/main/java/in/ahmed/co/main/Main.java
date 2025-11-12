package in.ahmed.co.main;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.ahmed.co.configuration.AppConfig;
import in.ahmed.co.model.Plan;
import in.ahmed.co.service.PlanService;

public class Main {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		PlanService bean = context.getBean(PlanService.class);
		Plan byId = bean.getById("p-103");
		System.out.println(byId);
		System.out.println("=".repeat(50));

		HashMap<String, Plan> all = bean.getAll();
		all.forEach((key, value) -> System.out.println(key + " => " + value));

	}

}
