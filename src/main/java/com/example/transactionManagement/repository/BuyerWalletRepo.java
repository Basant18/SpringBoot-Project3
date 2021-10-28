package com.example.transactionManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.transactionManagement.entity.BuyerWallet;

@Repository
public interface BuyerWalletRepo extends JpaRepository<BuyerWallet, String>{
	
}
