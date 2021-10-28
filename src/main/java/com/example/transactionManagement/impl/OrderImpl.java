package com.example.transactionManagement.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.example.transactionManagement.entity.OrderCart;
import com.example.transactionManagement.exception.CustomException;
import com.example.transactionManagement.repository.OrderCartRepo;

@Service
public class OrderImpl {

	@Autowired
	OrderCartRepo orderRepo;
	
	@Transactional(propagation = Propagation.REQUIRED)
	public void createOrder(OrderCart ord) throws CustomException {
		orderRepo.save(ord);
		//throw new CustomException("Rollback is invalid");
	}
	
}
