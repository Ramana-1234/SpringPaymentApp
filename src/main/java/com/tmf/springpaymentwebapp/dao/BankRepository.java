package com.tmf.springpaymentwebapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tmf.springpaymentwebapp.entity.BankAccountsEntity;

@Repository
public interface BankRepository extends JpaRepository<BankAccountsEntity, Integer> {

}
