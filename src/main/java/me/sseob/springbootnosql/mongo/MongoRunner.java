package me.sseob.springbootnosql.mongo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class MongoRunner implements ApplicationRunner {

	@Autowired
	MongoTemplate mongoTemplate;

	@Autowired
	AccountRepository accountRepository;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {

		Account account = new Account();
		account.setAge(28);
		account.setUsername("sseob");

		accountRepository.insert(account);
		Optional<Account> byId = accountRepository.findById(account.getId());
		System.out.println("MongoRunner: " + byId);
	}
}
