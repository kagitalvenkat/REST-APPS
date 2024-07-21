package in.sbms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import in.sbms.service.UserService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		//context.getBean(null);
		
		/*
		 * final String USER_URL = "https://reqres.in/api/unknown"; RestTemplate rt =
		 * new RestTemplate(); ResponseEntity<String> forEntity =
		 * rt.getForEntity(USER_URL, String.class); String body = forEntity.getBody();
		 * System.out.println(body);
		 */
		UserService service = context.getBean(UserService.class);
		service.getUsers();
		
	}

}
