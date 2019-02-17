package com.example.apidemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@EnableAutoConfiguration
@Controller
public class ApidemoApplication {

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello, World!. This is my first spring app..";
    }

	public static void main(String[] args) {

	    SpringApplication.run(ApidemoApplication.class, args);
	}

}

