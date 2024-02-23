package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Employee {
	int id, salary;
	String name, address, gender;
	
	
	public Employee() {
		super();
	}

	public Employee(int id, int salary, String name, String address, String gender) {
		super();
		this.id = id;
		this.salary = salary;
		this.name = name;
		this.address = address;
		this.gender = gender;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	
	
}
