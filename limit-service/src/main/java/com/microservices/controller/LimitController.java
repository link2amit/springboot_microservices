package com.microservices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.beans.PropertyConfiguration;
import com.microservices.service.Configuration;

@RestController
public class LimitController {
	
	@Autowired
	private Configuration config;
	
	@GetMapping("/limits")
	public PropertyConfiguration getLimitConfiguration() {
		
		PropertyConfiguration propertyConfiguration = new PropertyConfiguration(config.getMaximum(), config.getMinimum());
		return propertyConfiguration;
	}

}
