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
/*
echo "# github-cicd" >> README.md
git init
git add README.md
git commit -m "first commit"
git branch -M main
git remote add origin https://github.com/LOGONEDIGITAL-TekHub-Academy/github-cicd.git
git push -u origin main*/
