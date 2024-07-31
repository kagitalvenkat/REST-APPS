package in.sbms.service;


import java.util.stream.Stream;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import in.sbms.response.RestCountrie;

@Service
public class CountrieServices {
	private final String COUNTRIES_URL = "https://restcountries.com/v3.1/all";
	
	public void getData() {
		
		RestTemplate rt = new RestTemplate();
		ResponseEntity<RestCountrie[]> forEntity = rt.getForEntity(COUNTRIES_URL, RestCountrie[].class);
		RestCountrie[] body = forEntity.getBody();
		Stream.of(body).filter(c -> c.getRegion().equalsIgnoreCase("Asia")).distinct().forEach(System.out::println);
		//Stream.of(body).forEach(System.out::println);
	
	}

}
