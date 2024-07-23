package in.sbms.controller;

import java.util.StringJoiner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.sbms.client.WelcomeServiceClient;

@RestController
public class GreetController {
	
	@Autowired
	private WelcomeServiceClient client;
	
	@GetMapping(value="/greet")
	public String greetMsg() {
		String msg1 = "Hi, ";
		String msg2 = client.invokeWelcomeClient();
		
		StringJoiner sj = new StringJoiner(",");
		sj.add(msg1);
		sj.add(msg2);
		
		return sj.toString();
	}

}
