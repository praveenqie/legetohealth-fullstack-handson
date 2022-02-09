package com.legato.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.MediaType;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OauthController {
	
	
	@RequestMapping(value = "user",produces = MediaType.APPLICATION_JSON_VALUE)
	public Map<String,Object> user(OAuth2Authentication auth2Authentication){
		Map<String,Object> users = new HashMap<String, Object>();
		users.put("user",auth2Authentication.getUserAuthentication().getPrincipal());
		users.put("authorities", auth2Authentication.getUserAuthentication().getAuthorities());
		return users;
	}

}
