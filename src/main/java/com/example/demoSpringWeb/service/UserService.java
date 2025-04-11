package com.example.demoSpringWeb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demoSpringWeb.dao.UserAccountDetailsRepository;
import com.example.demoSpringWeb.dao.UserRepository;
import com.example.demoSpringWeb.entity.UserAccountDetailsEntity;
import com.example.demoSpringWeb.entity.UserEntity;

@Service
public class UserService {
	@Autowired
	private UserRepository Userrepo;
	public void register(UserEntity userEntity) {
		System.out.println("Registering User:"+ userEntity.getUsername());
		Userrepo.save(userEntity);
		
	}
	@Autowired
	private UserAccountDetailsRepository UserAccountrepo;
	public void registerUserAccount(UserAccountDetailsEntity userAccountDetailsEntity) {
			UserAccountrepo.save(userAccountDetailsEntity);
	}
	
	public boolean login (String username, String password) {
		System.out.println("Logging in User:" + username);
		return true;
	}

}