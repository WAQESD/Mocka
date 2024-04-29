package com.mozart.mocka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class MockaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MockaApplication.class, args);
	}

}