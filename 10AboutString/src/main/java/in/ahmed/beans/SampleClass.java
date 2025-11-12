package in.ahmed.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SampleClass {

	@Autowired
	private String url;
	
	public String gwtUrl()
	{
		return url;
	}
	
	

//	@Autowired
//	private String port;
//
//	@Autowired
//	private String username;
//
//	@Autowired
//	private String password;

}
