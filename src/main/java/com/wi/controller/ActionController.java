//$Id$
package com.wi.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ActionController {
	  Logger logger = LoggerFactory.getLogger(ActionController.class);


	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		logger.info("hi {}, {}", 1,2);
		logger.trace("hi {}, {}", 1,2);
		return String.format("Hello hi %s!", name);
	}
}
