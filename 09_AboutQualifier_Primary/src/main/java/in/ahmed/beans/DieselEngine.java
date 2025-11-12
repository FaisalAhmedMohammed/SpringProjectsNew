package in.ahmed.beans;

import org.springframework.stereotype.Component;

@Component
public class DieselEngine implements Engine {

	public void start() {
		System.out.println("Engine Engine is Started");
	}

}
