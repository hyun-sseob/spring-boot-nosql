package me.sseob.springbootnosql.mongo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collation = "accounts")
public class Account {

	@Id
	private String id;
	private String username;
	private int age;

	@Override
	public String toString() {
		return "Account{" +
				"id=" + id +
				", username='" + username + '\'' +
				", age=" + age +
				'}';
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
