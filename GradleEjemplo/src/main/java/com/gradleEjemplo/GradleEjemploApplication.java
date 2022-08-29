package com.gradleEjemplo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class GradleEjemploApplication {

	public static void main(String[] args) {
		SpringApplication.run(GradleEjemploApplication.class, args);
	}

}
