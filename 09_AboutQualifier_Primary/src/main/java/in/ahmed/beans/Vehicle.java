package in.ahmed.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Vehicle {

	@Autowired
	Engine engine;

	public void drive() {
		engine.start();
	}

}
