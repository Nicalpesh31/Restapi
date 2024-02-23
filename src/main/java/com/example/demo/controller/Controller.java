package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Product;
import com.example.demo.services.ProductService;

import jakarta.servlet.http.HttpServletResponse;

@RestController
public class Controller {
	
	@Autowired
	private ProductService service;
	
	@PostMapping("/add")
	public void add(@RequestBody Product product) {
		service.save(product);
	}
	
	@GetMapping("/product")
	public List<Product> list(){
		return service.ListAll();
	}
	
	@GetMapping ("/product/{id}")
	public ResponseEntity<Product> get(@PathVariable Integer id){
		Product product=service.get(id);
		
		try {
			return new ResponseEntity<Product>(product,HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<Product>(product,HttpStatus.NOT_FOUND);
		}
	}
	
	@PutMapping("/updateproduct/{id}")
	public ResponseEntity<Product>update(@RequestBody Product product ,@PathVariable Integer id){
			
			Product existproduct=service.get(id);
			service.save(product);
			try {
				return new ResponseEntity<Product>(product, HttpStatus.OK);
			} catch (Exception e) {
				// TODO: handle exception
				return new ResponseEntity<Product>(product, HttpStatus.NOT_FOUND);
			}
			
		}
//		@DeleteMapping("/delete/{id}")
//		public void delete(@PathVariable Integer id) {
//			service.delete(id);
//		}


}

