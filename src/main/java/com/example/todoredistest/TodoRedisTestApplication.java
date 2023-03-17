package com.example.todoredistest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class TodoRedisTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(TodoRedisTestApplication.class, args);
	}

}
