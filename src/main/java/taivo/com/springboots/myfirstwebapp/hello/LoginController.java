package taivo.com.springboots.myfirstwebapp.hello;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	
//	private AuthenticationService authenticationService;
//	public LoginController(AuthenticationService authenticationService) {
//		super();
//		this.authenticationService = authenticationService;
//	}

	private Logger logger = LoggerFactory.getLogger(getClass());

	@RequestMapping(value = "/",method = RequestMethod.GET)
	public String gotoWelcomePage(ModelMap model) {
		model.put("name","taivo");
		return "welcome";
	}

	@RequestMapping(value = "login-jsp",method = RequestMethod.GET)
	public String loginView() {
		logger.info("I wanted printed at info level");
		logger.warn("I want printed at warm level");
		return "login";
	}
	
//	@RequestMapping(value = "login-jsp",method = RequestMethod.POST)
//	public String welcomeView(@RequestParam String name,
//			@RequestParam String password,
//			ModelMap model) {
//		Boolean valid = authenticationService.validateLogin(name, password);
//		if(valid) {
//			model.put("name", name);
//			model.put("password", password);
//			return "listTodo";
//		}
//		model.put("errorMessage", "Invalid Credentials! Please try again.");
//		return "login";
//	}
}
