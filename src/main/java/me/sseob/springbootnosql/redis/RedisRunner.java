package me.sseob.springbootnosql.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Component;

@Component
public class RedisRunner implements ApplicationRunner {

	@Autowired
	StringRedisTemplate redisTemplate;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		ValueOperations<String, String> values = redisTemplate.opsForValue();

		values.set("sseob", "sseob!!");
		values.set("sseob age", "28");
		values.set("hello", "world");
	}
}
