package in.sbms.rest;

import java.util.Random;

import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.*;

@RestController
public class DataRestController {
	//LoggerFactory
	@GetMapping("/data")
	@HystrixCommand(fallbackMethod = "getDataFromDB", 
	commandProperties = {
			@HystrixProperty(name = "circuitBreaker.requestVolumeThreshold", value = "5"),
			@HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds", value = "1000"),
			@HystrixProperty(name = "circuitBreaker.enabled", value = "true") })
	public String getDataFromRedis() {
			System.out.println("DataRestController.getDataFromRedis()");
		if(new Random().nextInt(5)<=5) {
			throw new RuntimeException("Redis server down");
		}
		return "Data accessed from Redis...";
	}
	
	
	public String getDataFromDB() {
		System.out.println("DataRestController.getDataFromDB()");
		return "Data accessed from DB...";
	}

}
