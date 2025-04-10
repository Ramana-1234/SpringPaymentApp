package com.tmf.springpaymentwebapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.tmf.springpaymentwebapp.entity.TransactionEntity;
import com.tmf.springpaymentwebapp.service.TransactionService;

@Controller
public class TestController {
	
	@Autowired
	private TransactionService txnService;
	
	@GetMapping("/Transaction")
	public String listofTransactions() {
		List<TransactionEntity>  listOfTxn=txnService.getTxn();
		for(TransactionEntity txn:listOfTxn) {
			System.out.println(txn);
			
		}
		return "transactions";
		
	}
	
	}
	
	

	
	

