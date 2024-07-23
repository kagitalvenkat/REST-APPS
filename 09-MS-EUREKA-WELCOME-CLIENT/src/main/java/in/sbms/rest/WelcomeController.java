package in.sbms.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	
	@GetMapping(value = "/welcome")
	public String welcomeMsg() {
		String msg = " WELCOME TO MICRO SERVICES";
		return msg;		
	}

}
