package com.example.demo.jdbc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Homeresource {

	
	@GetMapping("/")
	public String home() {
		return ("Welcome home");
	}
	
	@GetMapping("/user")
	public String users() {
		return ("Welcome Users");
		
	}
	
	@GetMapping("/admin")
	public String admins() {
		return ("Welcome Admin");
	}
}
