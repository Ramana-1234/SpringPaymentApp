package com.tmf.springpaymentwebapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RemoveBankController {
	@GetMapping("/removeBankAccount")
	public String removeBankAccount() {
		System.out.println("REMOVE BANK ACCOUNT");
		return "removeBankAccount";
		
	}

}