package com.tmf.springpaymentwebapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tmf.springpaymentwebapp.dao.UserRepository;
import com.tmf.springpaymentwebapp.entity.UserEntity;

@Service
public class UserService {
	@Autowired
	private UserRepository Userrepo;
	public void register(UserEntity userEntity) {
		System.out.println("Registering User:"+ userEntity.getUsername());
		Userrepo.save(userEntity);
		
	}
	
	public boolean login (String username, String password) {
		System.out.println("Logging in User:" + username);
		return true;
	}

}