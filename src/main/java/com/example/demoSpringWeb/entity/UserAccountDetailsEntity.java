package com.example.demoSpringWeb.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="user_account_details")
public class UserAccountDetailsEntity {
	
	@Id
	@Column(name="user_account_id")
	private int userAccountId;
	
	@Column(name="user_id")
	private int userId;
	
	@Column(name="account_open_date")
	private String accountOpenDate;
	
	@Column(name="current_wallet_balance")
	private double currentWalletBalance;
	
	@Column(name="linked_bank_accounts_count")
	private int linkedBankAccountsCount;
	
	@Column(name="wallet_pin")
	private String walletPin;
	

}
