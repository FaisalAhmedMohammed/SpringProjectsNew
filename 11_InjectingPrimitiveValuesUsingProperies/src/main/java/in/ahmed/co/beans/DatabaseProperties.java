package in.ahmed.co.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

@Repository
public class DatabaseProperties {
	@Value("${db.url}")
	private String url;
	
	@Value("${db.port}")
	private int port;
	
	@Value("${db.username}")
	private String userName;
	
	@Value("${db.password}")
	private String password;
	
	public void show() {
		System.out.println("DataBase Url : " + url);
		System.out.println("DataBase Port : " + port);
		System.out.println("DataBase UserName : " + userName);
		System.out.println("DataBase Password : " + password);
	}
}
