package com.example.portfolio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class FromJavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(FromJavaApplication.class, args);
	}

}
