package in.ahmed.co.configuration;

import java.util.HashMap;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import in.ahmed.co.model.Plan;

@ComponentScan("in.ahmed.co")
@Configuration
public class AppConfig {

	@Bean // here creating bean object because our class Plan depends on HashMap object so
			// we need to create the object
	public HashMap<String, Plan> hashMap() {

		HashMap<String, Plan> hm = new HashMap<>(); // here i am creating hash map object
		
		hm.put("p-101", new Plan(101, 20, "2.0 GB unlimited with 100 Sms", 349));
		hm.put("p-102", new Plan(102, 28, "2.0 GB unlimited with 100 Sms", 349));
		hm.put("p-103", new Plan(103, 1, " unlimited with 100 Sms", 100));
		hm.put("p-104", new Plan(104, 56, "2.0 GB unlimited with 100 Sms", 649));
		hm.put("p-105", new Plan(105, 120, "2.0 GB unlimited with 100 Sms", 1249));

		return hm;
	}

}
