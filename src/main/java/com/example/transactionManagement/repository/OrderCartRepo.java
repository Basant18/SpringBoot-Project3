package com.example.transactionManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.transactionManagement.entity.OrderCart;

@Repository
public interface OrderCartRepo extends JpaRepository<OrderCart, String>{

}
