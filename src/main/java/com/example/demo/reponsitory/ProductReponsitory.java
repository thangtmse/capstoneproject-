package com.example.demo.reponsitory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Product;

public interface ProductReponsitory extends JpaRepository<Product, Long> {

	
}
