package com.mta.github_cicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Application {

	@GetMapping("/welcome")
	public String welcome() {
		return "Welcome to Github Actions CICD";
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}

