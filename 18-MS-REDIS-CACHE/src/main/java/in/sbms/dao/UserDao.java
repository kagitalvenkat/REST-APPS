package in.sbms.dao;

import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import in.sbms.data.User;

@Repository
public class UserDao {

	private HashOperations<String, String, User> hashOps;
	
	public UserDao(RedisTemplate<String, User> redisTemplate) {
		hashOps=redisTemplate.opsForHash();
	}
	
	public void saveUser(User user) {
		hashOps.put("User", user.getUserId(), user);
	}
	
	public User getUserById(String userId) {
		return hashOps.get("User", userId);
	}
}
