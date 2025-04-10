package com.tmf.springpaymentwebapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.tmf.springpaymentwebapp.entity.UserEntity;
import com.tmf.springpaymentwebapp.service.UserService;



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
			                     @RequestParam String address) {
		
	UserEntity userEntity = new UserEntity();
	userEntity.setUsername(username);
	userEntity.setPassword(password);
	userEntity.setFirstname(firstname);
	userEntity.setLastname(lastname);
	userEntity.setPhone(phone);
	userEntity.setEmail(email);
	userEntity.setAddress(address);
	
	userService.register(userEntity);
	
	return "login";
	
	}
}
	
			                     
			                    
	
	









	
    
   
