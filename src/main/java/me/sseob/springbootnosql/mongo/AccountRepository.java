package me.sseob.springbootnosql.mongo;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface AccountRepository extends MongoRepository<Account, String> {
	Optional<Account> findByUsername(String username);
}
