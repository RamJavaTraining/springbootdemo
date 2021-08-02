package com.imcs.spring.springbootdemo;

import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	public User getUser() {
		
		User user= new User();
		user.setName("IMCs");
		
		return user;
	}

}
