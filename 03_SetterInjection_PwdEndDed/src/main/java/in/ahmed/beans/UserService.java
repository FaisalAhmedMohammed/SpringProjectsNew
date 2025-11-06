package in.ahmed.beans;

import java.util.HashMap;
//Dependent Class
public class UserService {

	PasswordService pwdService;// Dependency Object

	public void setPwdService(PasswordService pwdService) {//setter injection
		this.pwdService = pwdService;
	}

	HashMap<String, User> userMap = new HashMap<>();

	public void SaveUser(String name, String password) {

		String encodePwd = pwdService.encodePwd(password);

		System.out.println("Original Password : " + password);
		System.out.println("Encoded Password : " + encodePwd);

		User user = new User(name, encodePwd);
		userMap.put(name, user);// add the name and User object to the map object
		System.out.println("User Saved");
		System.out.println("*".repeat(50));

	}

	public void fetchUser(String name) {

		User user = userMap.get(name);//fetching name form the map object

		if (user == null) {
			System.out.println("No User is found");
		} else {
			String decodePwd = pwdService.decodePwd(user.getPassdword());
			System.out.println("Decoded Password : " + user.getPassdword());
			System.out.println("Original Password : " + decodePwd);

		}

	}

}
