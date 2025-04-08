package com.example.demoSpringWeb.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demoSpringWeb.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity,Integer>{
	UserEntity findByusernameAndpassword(String username, String password);
}
