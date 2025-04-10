package com.example.demoSpringWeb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demoSpringWeb.dao.BankRepository;
import com.example.demoSpringWeb.entity.BankAccountsEntity;

@Service
public class BankService {
	@Autowired
	private BankRepository Bankrepo;
	public void registerBank(BankAccountsEntity bankEntity) {
		
		Bankrepo.save(bankEntity);
		
	}

		


}
