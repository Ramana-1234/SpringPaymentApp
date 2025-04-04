package com.example.demoSpringWeb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AddBankController {
	@GetMapping("/addBankAccount")
	public String addBankAccount() {
		System.out.println("ADD BANK ACCOUNT");
		return "addBankAccount";
		
	}

}
