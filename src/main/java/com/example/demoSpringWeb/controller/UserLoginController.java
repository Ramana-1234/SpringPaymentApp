package com.example.demoSpringWeb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserLoginController {
	@GetMapping("/login")
	public String login() {
		System.out.println("LOGIN");
		return "login";
		
	}

}
