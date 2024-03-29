package com.example.Transportrutter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController


@RequestMapping("/api/v1/transportrutter")
public class TransportrutterApplication {

	@GetMapping
	public String message(){
		return "your app has deployed";
	}

	public static void main(String[] args) {
		SpringApplication.run(TransportrutterApplication.class, args);
	}

}
