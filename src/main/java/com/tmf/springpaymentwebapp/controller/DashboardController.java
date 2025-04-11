package com.tmf.springpaymentwebapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class DashboardController {
	@PostMapping("/logout")
	public String logout() {
			System.out.println("log out");
		return "login";
	}
	@PostMapping("/sendMoney")
	public String showSendMoneyPage() {
			System.out.println("send money");
		return "sendMoney";
	}
	@PostMapping("/addBankAccount")
	public String showAddBankAccountPage() {
			System.out.println("Add bank accont");
		return "addBankAccount";
	}
	@PostMapping("/detailedStatement")
	public String showdetailedStatement() {
			System.out.println("Detailed statement");
		return "transactions";
	}
}
