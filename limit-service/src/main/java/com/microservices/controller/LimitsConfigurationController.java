package com.microservices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.bean.LimitConfiguration;
@RestController
public class LimitsConfigurationController {
	
	@Autowired
	private com.microservices.config.Configuration configuration;

	@GetMapping(path="/limits")
	public LimitConfiguration retrieveLimitsFromConfigurations() {
		return new LimitConfiguration(configuration.getMaximum(),configuration.getMinimum());
	}
}
