package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping("/ok")
	public String ok() {
		return "OK!";
	}

	@GetMapping("/test1")
	public String test1() {
		return "OK1!";
	}

	@PostMapping("/user")
	public Map<String,String> user(@RequestBody Map<String,String> requestUserDetails) {
		return requestUserDetails;
	}
}
