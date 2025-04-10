package com.tmf.springpaymentwebapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.tmf.springpaymentwebapp.dao.UserRepository;
import com.tmf.springpaymentwebapp.entity.UserEntity;



@Controller
public class UserLoginController {
	
	@Autowired
    private UserRepository userRepository;
	 
	@RequestMapping("/login")
	public String showLoginPage() {
		System.out.println("login");
		return "login";
	}
	
	@PostMapping("/loginForm")
    public String authenticateUser(@RequestParam("username") String username,
                                   @RequestParam("password") String password,
                                   Model model) {
        UserEntity user = userRepository.findByUsernameAndPassword(username, password);

        if (user != null && user.getPassword().equals(password))  {
            return "dashboard";
        } else {
            model.addAttribute("errorMessage", "Invalid Username or Password");
            return "login"; 
        }
    }
}
