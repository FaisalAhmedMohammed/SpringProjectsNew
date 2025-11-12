package in.ahmed.beans.Config;

import java.util.HashMap;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import in.ahmed.beans.Model.Plan;

@Configuration
@ComponentScan("in.ahmed.beans")
public class AppConfig {
	
	@Primary
	@Bean
	public HashMap<String, Plan> hashMap() {
		HashMap<String, Plan> hs = new HashMap<>();
		hs.put("id-101", new Plan(101, "2GB/day, 100Sms/day", 28, 349));
		hs.put("id-102", new Plan(102, "1GB/day, 100Sms/day", 28, 249));
		hs.put("id-103", new Plan(103, "unlimited, 100Sms/day", 1, 100));
		return hs;
	}

	
	@Bean
	public HashMap<String, Plan> hashMap2() {
		HashMap<String, Plan> hs = new HashMap<>();
		hs.put("id-104", new Plan(104, "2GB/day, 100Sms/day", 28, 349));
		hs.put("id-105", new Plan(105, "1GB/day, 100Sms/day", 28, 249));
		hs.put("id-106", new Plan(106, "unlimited, 100Sms/day", 1, 100));
		return hs;
	}

}
