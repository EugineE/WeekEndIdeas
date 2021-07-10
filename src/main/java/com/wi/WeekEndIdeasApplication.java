package com.wi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class WeekEndIdeasApplication {

	public static void main(String[] args) {
		SpringApplication.run(WeekEndIdeasApplication.class, args);
	}

	
}
