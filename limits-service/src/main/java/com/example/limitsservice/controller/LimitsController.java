package com.example.limitsservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.limitsservice.beans.Limits;
import com.example.limitsservice.configuration.LimitsConfiguration;

@RestController
public class LimitsController {
	@Autowired
	private LimitsConfiguration limitsConfiguration;

	@GetMapping("/limits")
	public Limits retrieveLimits() {
		return new Limits(limitsConfiguration.getMinimum(),limitsConfiguration.getMaximum());
		// hard coded values here
//		return new Limits(1,1000);
	}
}
