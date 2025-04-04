package com.example.demoSpringWeb.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demoSpringWeb.entity.TransactionEntity;

@Repository
public interface TransactionRepository extends JpaRepository<TransactionEntity , Integer> {

}
