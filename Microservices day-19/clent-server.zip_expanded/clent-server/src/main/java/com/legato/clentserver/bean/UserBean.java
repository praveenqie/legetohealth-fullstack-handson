package com.legato.clentserver.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserBean {

	@Value("${user.name}")
	private String port;
	
	public String getPort() {
		return port;
	}
	
}
