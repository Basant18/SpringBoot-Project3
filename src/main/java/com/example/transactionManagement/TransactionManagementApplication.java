package com.example.transactionManagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.transactionManagement.entity.BuyerWallet;
import com.example.transactionManagement.entity.OrderCart;
import com.example.transactionManagement.exception.CustomException;
import com.example.transactionManagement.service.BuyService;

@SpringBootApplication
public class TransactionManagementApplication {

	public static void main(String[] args) {
		//SpringApplication.run(TransactionManagementApplication.class, args);
		ApplicationContext context = SpringApplication.run(TransactionManagementApplication.class, args);
		BuyService buyService = context.getBean(BuyService.class);
		BuyerWallet buy = new BuyerWallet();
		buy.setBuyName("Basant");
		OrderCart ord = new OrderCart();
		ord.setOrderItemName("Book");
		try {
			buyService.createBuy(buy,ord);
		} catch (CustomException e) {
			e.printStackTrace();
		}
	}

}
