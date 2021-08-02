package com.imcs.spring.springbootdemo;

import org.springframework.stereotype.Component;

@Component
public class User {
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private String name;

}
