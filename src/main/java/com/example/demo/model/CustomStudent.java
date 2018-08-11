package com.example.demo.model;

import org.springframework.data.rest.core.config.Projection;

@Projection(
		  name = "customStudent", 
		  types = { Student.class }) 
public interface CustomStudent {
	
	String getName();

}
