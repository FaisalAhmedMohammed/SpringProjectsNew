package in.ahmed.beans.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("in.ahmed.co")
public class AppConfig {

	@Bean
	public String string() {
		return new String("Hello");

	}

}
