package com.tmf.springpaymentwebapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.tmf.springpaymentwebapp.entity.BankAccountsEntity;
import com.tmf.springpaymentwebapp.service.BankService;



@Controller
public class AddBankController {
	@Autowired
	private BankService bankService;
	
	@GetMapping("/addBankAccount")
	public String addBankAccount() {
		System.out.println("ADD BANK ACCOUNT");
		return "addBankAccount";
	}

	
	@PostMapping("/addBank")
	public String addBankAccount(@RequestParam String accountNumber,
						  @RequestParam String ifscCode,
						  @RequestParam String bankName,
						  @RequestParam String bankAccountBranchLocation,
						  @RequestParam String isActive,
						  @RequestParam int userAccountId,
						  @RequestParam int userId) {
		
		BankAccountsEntity bankEntity = new BankAccountsEntity();
		bankEntity.setAccountNumber(accountNumber);
		bankEntity.setIfscCode(ifscCode);
		bankEntity.setBankName(bankName);
		bankEntity.setBankAccountBranchLocation(bankAccountBranchLocation);
		bankEntity.setIsActive(isActive);
		
		
		
		bankService.registerBank(bankEntity);
							
		return "addBankAccount" ;			
			           
	}

}
