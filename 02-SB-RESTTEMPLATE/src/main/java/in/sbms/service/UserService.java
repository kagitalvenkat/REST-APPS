package in.sbms.service;

import java.util.Arrays;
import java.util.stream.Stream;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import in.sbms.data.Data;
import in.sbms.data.User;

@Service
public class UserService {

	final String USER_URL = "https://reqres.in/api/unknown";

	public User getUsers() {
		RestTemplate rt = new RestTemplate();
		ResponseEntity<User> forEntity = rt.getForEntity(USER_URL, User.class);
		User body = forEntity.getBody();
		Integer page = forEntity.getBody().getPage();
		Integer total = forEntity.getBody().getTotal();
		System.out.println(page+ " :: Page Number => Total Number of Data:" +total);
		Data[] data = forEntity.getBody().getData();
		System.out.println(data[1].getName());
		System.out.println(body);
		
		return body;
		
	}

}
