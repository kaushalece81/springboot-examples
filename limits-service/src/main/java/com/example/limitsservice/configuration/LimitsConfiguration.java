package com.example.limitsservice.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Data;
@Configuration
@ConfigurationProperties(prefix = "limits-service")
@Data
public class LimitsConfiguration {
	private int minimum;
	private int maximum;
}
