package com.example.demoSpringWeb.controller;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demoSpringWeb.entity.UserAccountDetailsEntity;
import com.example.demoSpringWeb.entity.UserEntity;
import com.example.demoSpringWeb.service.UserService;

@Controller
public class UserRegistrationController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/register")
	public String registrationPage() {
		System.out.println("Register");
		return "register";
	}
	
	@PostMapping("/registerUser")
	public String  registerUser (@RequestParam String username,
			                     @RequestParam String password,
			                     @RequestParam String firstname,
			                     @RequestParam String lastname,
			                     @RequestParam String phone,
			                     @RequestParam String email,
			                     @RequestParam String address,
			                     @RequestParam String walletpin ) {
		
	UserEntity userEntity = new UserEntity();
	userEntity.setUsername(username);
	userEntity.setPassword(password);
	userEntity.setFirstname(firstname);
	userEntity.setLastname(lastname);
	userEntity.setPhone(phone);
	userEntity.setEmail(email);
	userEntity.setAddress(address);
	
	
	UserAccountDetailsEntity userAccountDetailsEntity = new UserAccountDetailsEntity();
	userAccountDetailsEntity.setUserEntity(userEntity);
	userAccountDetailsEntity.setAccountOpenDate(LocalDate.now());
	userAccountDetailsEntity.setWalletPin(walletpin);

	userService.register(userEntity);
	userService.registerUserAccount(userAccountDetailsEntity);
	
	return "login";
	
	}
}
	
			                     
			                    
	
	









	
    
   
