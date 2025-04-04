package com.example.demoSpringWeb.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Transactions")
public class TransactionEntity {
	@Id
	@Column(name="txn_id")
	private int txnId;
	
	@Column(name="amount")
	private double amount;
	
	@Column(name="txn_date")
	private String txnDate;

}
