package in.sbms.service;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import in.sbms.rest.Data;
import in.sbms.rest.User;

@Service
public class UserService {
	
	private final String USER_DATA = "https://reqres.in/api/users?page=2";
	
	public void getUserData() {
		WebClient client = WebClient.create();
		User user = client.get().
				uri(USER_DATA).
				accept(MediaType.APPLICATION_JSON).
				retrieve().
				bodyToMono(User.class).
				block();
		
		System.out.println(user);
		Data[] data = user.getData();
		System.out.println("Name :"+data[1].getFirst_name()+"."+data[1].getLast_name());
	}

}
