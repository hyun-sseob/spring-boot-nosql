package me.sseob.springbootnosql.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class RedisRunner implements ApplicationRunner {

	@Autowired
	StringRedisTemplate redisTemplate;

	@Autowired
	AccontRepository accontRepository;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		ValueOperations<String, String> values = redisTemplate.opsForValue();

		values.set("sseob", "sseob!!");
		values.set("sseob age", "28");
		values.set("hello", "world");

		Account account = new Account();
		account.setUsername("sseob");
		account.setAge(28);

		accontRepository.save(account);

		Optional<Account> byId = accontRepository.findById(account.getId());
		System.out.println(byId);
	}
}
