package com.tmf.springpaymentwebapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.tmf.springpaymentwebapp.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity,Integer>{
	public UserEntity findByUsernameAndPassword(String username, String password);

}
