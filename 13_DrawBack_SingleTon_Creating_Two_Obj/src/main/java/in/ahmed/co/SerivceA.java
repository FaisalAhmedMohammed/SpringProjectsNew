package in.ahmed.co;

import org.springframework.stereotype.Component;

/*Single Ton class means only one object should be created per container 
But in configuration class I am creating object of ServiceB and storing 
the container in this scenario two objects are created in one container 
with two different names spring allows as explicitly create the object 
and store it in to the container
*/

@Component
public class SerivceA {

	public SerivceA() {
		System.out.println("ServiceA :: Constructor");
	}

}
