package com.legato.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DigitalSignKey {
	
	@Value("${signing.key}")
	private String key;
	
	public String getKey() {
		return key;
	}

}
