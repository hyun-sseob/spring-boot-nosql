package me.sseob.springbootnosql.redis;

import org.springframework.data.repository.CrudRepository;

public interface AccontRepository extends CrudRepository<Account, Long> {
	
}
