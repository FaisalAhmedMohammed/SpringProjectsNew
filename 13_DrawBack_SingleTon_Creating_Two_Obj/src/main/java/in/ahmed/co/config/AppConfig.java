package in.ahmed.co.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import in.ahmed.co.ServiceB;

@Configuration
@ComponentScan("in.ahmed.co")
public class AppConfig {

	@Bean // creating ServiceB object so in container if the class is a singleton but
			// multiple objects are created
	public ServiceB sb() {
		return new ServiceB();
	}

}
