package in.ahmed.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ServiceC {
	
	@Autowired
	ServiceA serviceA;
	
	public ServiceC() {
		System.out.println("SerivceC :: Constructor");
	}

}
