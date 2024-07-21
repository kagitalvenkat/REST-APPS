package in.sbms.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	
	@GetMapping(value = "/welcome/{name}")
	public String welcomeMsg(@PathVariable String name) {
		String msg ="Hi,"+name+" Welcome to REST";
		
		return msg;
	}

}
