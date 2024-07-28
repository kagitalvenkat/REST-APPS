package in.sbms.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	private Logger log = LoggerFactory.getLogger(WelcomeController.class);

	@GetMapping(value = "/welcome")
	public String getMsg() {
		log.info("Welcome msg execution started");
		String msg = "Welcome to ZIPKIN";
		log.info("Welcome msg execution ended");
		return msg;
	}

}
