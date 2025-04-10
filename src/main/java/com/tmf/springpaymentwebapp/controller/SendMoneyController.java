package com.tmf.springpaymentwebapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SendMoneyController {
	@GetMapping("/sendMoney")
	public String sendMoney() {
		System.out.println("Send Money");
		return "sendMoney";
		
	}

}
