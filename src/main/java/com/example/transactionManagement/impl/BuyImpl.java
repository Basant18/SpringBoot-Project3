package com.example.transactionManagement.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.example.transactionManagement.entity.BuyerWallet;
import com.example.transactionManagement.repository.BuyerWalletRepo;

@Service
public class BuyImpl {

	@Autowired
	BuyerWalletRepo buyRepo;
	
//	@Transactional(label="emp",propagation=Propagation.REQUIRES_NEW)
//	public void createEmp(Employee emp) {
//		employeeRepo.save(emp);
//	}
	@Transactional(propagation = Propagation.REQUIRED)
	public void createBuy(BuyerWallet buy) {
		buyRepo.save(buy);
	}
	
}
