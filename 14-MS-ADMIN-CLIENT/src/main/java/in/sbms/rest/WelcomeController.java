package in.sbms.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	
	@GetMapping(value = "/welcome")
	public String welcomeMsg() {
		return "WELCOME TO ADMIN SERVER & CLIENT APP";
	}

}
