package com.example.demoSpringWeb.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demoSpringWeb.entity.UserAccountDetailsEntity;

@Repository
public interface UserAccountDetailsRepository extends JpaRepository<UserAccountDetailsEntity, Integer> {

}
