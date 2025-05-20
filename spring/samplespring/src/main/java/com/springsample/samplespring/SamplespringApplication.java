package com.springsample.samplespring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class SamplespringApplication {

	@GetMapping("/index")
	public static void main(String[] args) {
		SpringApplication.run(SamplespringApplication.class, args);
	}

}
