package in.ahmed.co.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

	@Value("${smpt.host}")
	private String smtpHost;

	@Value("${port}")
	private int smptPort;

	@Value("${smpt.toaddress}")
	private String toAddress;

	@Value("${smpt.fromaddress}")
	private String fromAddress;

	public void sendMail() {
		System.out.println("Email sent to : " + toAddress + " from : " + fromAddress + " with smtpHost : " + smtpHost
				+ " and smtpPort : " + smptPort);
	}

}
