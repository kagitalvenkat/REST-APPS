package in.sbms.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("WELCOME-CLIENT")
public interface WelcomeServiceClient {
	
	@GetMapping(value="/welcome")
	public String invokeWelcomeClient();

}
