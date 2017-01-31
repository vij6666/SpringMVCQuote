package com.vijay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringMvcQuoteApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMvcQuoteApplication.class, args);
	
	}
}
