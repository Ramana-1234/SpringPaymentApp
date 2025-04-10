package com.tmf.springpaymentwebapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewTransactionsController {
	@GetMapping("/viewTransactions")
	public String Transactions() {
		System.out.println("Transactions");
		return "transactions";
		
	}

}
