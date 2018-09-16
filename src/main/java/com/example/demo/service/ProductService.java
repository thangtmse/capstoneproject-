package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Product;
import com.example.demo.reponsitory.ProductReponsitory;

@Service
public class ProductService {
	@Autowired
	private ProductReponsitory productReponsitory;
	
	public Product save(Product p) {
		return productReponsitory.save(p);
	}
}
