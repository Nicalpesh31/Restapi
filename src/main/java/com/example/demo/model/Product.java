package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Product {
	@Id
	private Integer id;
    private String name;
    private float price;
    
    
	public Product(Integer id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	
	public Product() {
		super();
	}


	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
    
    
}
