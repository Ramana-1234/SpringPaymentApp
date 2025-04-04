package com.example.demoSpringWeb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demoSpringWeb.dao.TransactionRepository;

@Service
public class TransactionService {
	@Autowired
	private TransactionRepository txnrepo;
	public List getTxn() {
		return txnrepo.findAll();
	}

}
