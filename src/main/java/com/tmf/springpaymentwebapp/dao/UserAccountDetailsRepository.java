package com.tmf.springpaymentwebapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tmf.springpaymentwebapp.entity.UserAccountDetailsEntity;

@Repository
public interface UserAccountDetailsRepository extends JpaRepository<UserAccountDetailsEntity, Integer> {

}
