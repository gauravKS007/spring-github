package com.pizza.app.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = {"http://localhost:3000"})
@RequestMapping("/pizza")
public class WelcomeController {
	@RequestMapping(value="/hello", method = RequestMethod.GET, produces = "application/json")
	public String sayHello() {
		return new String("Pizza Takeaway");
	}
	
	
	
}
