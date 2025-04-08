package com.example.demoSpringWeb.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demoSpringWeb.entity.BankAccountsEntity;

@Repository
public interface BankRepository extends JpaRepository<BankAccountsEntity, Integer> {

}
