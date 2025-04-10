package com.tmf.springpaymentwebapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tmf.springpaymentwebapp.dao.BankRepository;
import com.tmf.springpaymentwebapp.entity.BankAccountsEntity;

@Service
public class BankService {
	@Autowired
	private BankRepository Bankrepo;
	public void registerBank(BankAccountsEntity bankEntity) {
		
		Bankrepo.save(bankEntity);
		
	}

		


}
