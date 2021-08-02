package com.imcs.spring.springbootdemo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/demo", method = RequestMethod.GET )
	public String demo() {
		return "Hello From Spring Boot";
	}
	
	@RequestMapping(value = "/list", method = RequestMethod.GET )
	public List<String> demoList() {
		
		List<String> list= new ArrayList<String>();
		list.add("Hello");
		list.add("IMCS");
		return list;
	}
	
	@RequestMapping(value = "/user", method = RequestMethod.GET )
	public User user() {
		
		
		return userService.getUser();
	}

}
