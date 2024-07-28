package in.sbms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.sbms.dao.UserDao;
import in.sbms.data.User;

@RestController
public class UserController {
	
	@Autowired
	private UserDao userDao;
	
	@PostMapping(value="/saveUser")
	public String saveUser(@RequestBody User user) {
		userDao.saveUser(user);
		return "success";
	}
	
	@GetMapping("/user/{userId}")
	public User getUserById(@PathVariable String userId) {
		return userDao.getUserById(userId);
		
	}

}
