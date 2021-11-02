package com.springboot.api.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api")
public class ApiController {
	
	private static Logger log = LoggerFactory.getLogger(ApiController.class);

	public String getMessage() {
		log.info("Enter into the getMessage() method");
		return "hello, here new api creating..";		
	}
}
