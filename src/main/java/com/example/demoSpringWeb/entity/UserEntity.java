package com.example.demoSpringWeb.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="user_details")
public class UserEntity {
	
	@Id
	@Column(name="user_id")
	private int userId;
	
	@Column(name="user_name")
	private String username;
	
	@Column(name="pass_word")
	private String password;
	
	@Column(name="first_name")
	private String firstname;
	
	@Column(name="last_name")
	private String lastname;
	
	@Column(name="phone")
	private String phone;
	
	@Column(name="email")
	private String email;
	
	@Column(name="address")
	private String address;
	

	
}
