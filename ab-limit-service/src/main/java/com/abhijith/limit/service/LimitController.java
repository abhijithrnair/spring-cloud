package com.abhijith.limit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitController {

	@Autowired
	private Configuration config;
	
	@RequestMapping("/limit-service")
	public LimitConfiguration getConfigs() {
		return new LimitConfiguration(config.getMinimum(), config.getMaximum());
	}
}
