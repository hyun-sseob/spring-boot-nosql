package me.sseob.springbootnosql.neo4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class Neo4jRunner implements ApplicationRunner {

	@Autowired
	Neo4jAccountRepository neo4jAccountRepository;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		Account account = new Account();
		account.setUsername("seyoung");
		account.setEmail("세영@gmail.com");
		
		Role role = new Role();
		role.setName("guest");

		account.getRoles().add(role);

		neo4jAccountRepository.save(account);

		System.out.println("Neo4jRunner: finished");
	}
}
