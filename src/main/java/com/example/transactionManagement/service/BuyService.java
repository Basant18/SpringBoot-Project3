package com.example.transactionManagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.example.transactionManagement.entity.BuyerWallet;
import com.example.transactionManagement.entity.OrderCart;
import com.example.transactionManagement.exception.CustomException;
import com.example.transactionManagement.impl.BuyImpl;
import com.example.transactionManagement.impl.OrderImpl;

@Service
public class BuyService {

	@Autowired
	BuyImpl buyImpl;
	
	@Autowired
	OrderImpl orderImpl;
	
	@Transactional(label="buyer",propagation=Propagation.REQUIRED,rollbackFor = CustomException.class)
	public void createBuy(BuyerWallet buy,OrderCart ord) throws CustomException {
		buyImpl.createBuy(buy);
		orderImpl.createOrder(ord);
	}
	
}
