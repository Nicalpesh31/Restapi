package com.example.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Service;

//@Service("es")
public class ExService {

	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
	
	ExService es=context.getBean(ExService.class);
	
	public int add(int a, int b) {
		return a+b;
	}
}
