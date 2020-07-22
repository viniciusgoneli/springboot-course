package com.vallosstudio.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.vallosstudio.course.entities.User;
import com.vallosstudio.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		User u1 = new User(null, "Maria da Silva", "maria@gmail.com", "999999", "99999");
		User u2 = new User(null, "Carlos Maurício", "carlos@gmail.com", "999999", "99999");

		userRepository.saveAll(Arrays.asList(u1, u2));
	}

}
