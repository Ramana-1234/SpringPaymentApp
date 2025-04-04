package com.example.demoSpringWeb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewBankDetailsController {
	@GetMapping("/bankDetails")
	public String BankDetails() {
		System.out.println("View Bank Details");
		return "bankDetails";
		
	}

}
