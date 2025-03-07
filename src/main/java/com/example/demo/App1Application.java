package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class App1Application {

	@GetMapping("/")
	public String main() {
		return "Docker app 1 >>>> hello >>> update";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(App1Application.class, args);
	}

}
