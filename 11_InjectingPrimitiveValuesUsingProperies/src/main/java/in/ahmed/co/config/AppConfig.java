package in.ahmed.co.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("in.ahmed.co")
@PropertySource("Email.properties")
@PropertySource("db.properties")
public class AppConfig {

}
