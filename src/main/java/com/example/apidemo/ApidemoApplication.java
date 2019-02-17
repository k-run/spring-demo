package com.example.apidemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableAutoConfiguration
public class ApidemoApplication {

	public static void main(String[] args) {

	    SpringApplication.run(ApidemoApplication.class, args);
	}

}

