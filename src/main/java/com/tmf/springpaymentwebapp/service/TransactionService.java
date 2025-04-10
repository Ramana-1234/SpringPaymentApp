package com.tmf.springpaymentwebapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tmf.springpaymentwebapp.dao.TransactionRepository;

@Service
public class TransactionService {
	@Autowired
	private TransactionRepository txnrepo;
	public List getTxn() {
		return txnrepo.findAll();
	}

}
