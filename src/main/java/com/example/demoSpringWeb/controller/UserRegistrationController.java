package com.example.demoSpringWeb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserRegistrationController {
	@GetMapping("/register")
	public String register() {
		System.out.println("Register");
		return "register";
		
	}

}
