package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookApplication {
	@GetMapping(value="/available")
	public String available(){
		return "Sprint in Action";
	}
	
	@GetMapping(value="/checked-out")
	public String checkedOut(){
		return "Spring Boot....... in action";
	}
}
