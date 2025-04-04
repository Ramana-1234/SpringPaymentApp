package com.example.demoSpringWeb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserDetailsController {
	@GetMapping("/profile")
	public String Profile() {
		System.out.println("User Details");
		return "profile";
		
	}

}