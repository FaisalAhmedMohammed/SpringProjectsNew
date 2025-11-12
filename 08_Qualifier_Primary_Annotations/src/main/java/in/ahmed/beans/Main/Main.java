package in.ahmed.beans.Main;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.ahmed.beans.Config.AppConfig;
import in.ahmed.beans.Model.Plan;
import in.ahmed.beans.Service.PlanSerivce;

public class Main {
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		PlanSerivce serivce = context.getBean(PlanSerivce.class);

		Plan byId = serivce.getById("id-101");
		System.out.println(byId);

		System.out.println("=".repeat(70));

		HashMap<String, Plan> all = serivce.getAll();

		Set<Entry<String, Plan>> entrySet = all.entrySet();

		for (Entry<String, Plan> entry : entrySet) {

			System.out.println(entry.getKey() + " --- " + entry.getValue());

		}
	}

}
