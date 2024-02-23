package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class ProductService {
	
	@Autowired
	private ProductRepository repository;
	
	public List<Product> ListAll(){
		return repository.findAll();
	}
	
	public void save(Product product) {
		repository.save(product);
	}
	
	public Product get(Integer id) {
		return repository.findById(id).get();
	}
	public void delete(Integer id) {
		repository.deleteById(id);
	}
	
}
