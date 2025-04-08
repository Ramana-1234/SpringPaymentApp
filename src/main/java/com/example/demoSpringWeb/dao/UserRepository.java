package com.example.demoSpringWeb.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demospringweb.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity,Integer>{
	UserEntity findByusernameAndpassword(String username, String password);
}
