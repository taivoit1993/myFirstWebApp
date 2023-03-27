package taivo.com.springboots.myfirstwebapp.hello;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
	public boolean validateLogin(String name, String password) {
		Boolean validaName = name.equalsIgnoreCase("taivo");
		Boolean validPassword = password.equalsIgnoreCase("huongdao");
		if(validaName && validPassword) {
			return true;
		}
		return false;
	}
}
