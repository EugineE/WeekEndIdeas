//$Id$
package com.wi.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wi.beanimpl.DataBeanImpl;
import com.wi.entity.User;
import com.wi.service.UserService;

@RestController
public class ActionController {
	 
	Logger logger = LoggerFactory.getLogger(ActionController.class);
	@Autowired
	private DataBeanImpl dataBeanImpl;
	@Autowired
	private UserService  userService;

	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		logger.info("hi {}, {}", 1,2);
		logger.trace("hi {}, {}", 1,2);
		//dataBeanImpl.insertTest();
		User user = new User();
		userService.save(user);
		
		return String.format("Hello hi %s!", name);
	}
}
