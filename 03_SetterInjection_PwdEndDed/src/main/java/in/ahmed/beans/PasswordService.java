package in.ahmed.beans;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class PasswordService {

	public String encodePwd(String password) {

		Encoder encoder = Base64.getEncoder();
		String encodeToString = encoder.encodeToString(password.getBytes());
		return encodeToString;

	}

	public String decodePwd(String password) {
		Decoder decode = Base64.getDecoder();
		byte[] b = decode.decode(password);
		String string = new String(b);
		return string;

	}

}
