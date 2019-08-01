/*
 * Copyright (c) 2019, ARNAB BANERJEE. All rights reserved.
 * 
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted only for academic purposes.
 * 
 * For further queries / info: arnab.ban09@gmail.com
 */

package com.arnab.spring.cloud.api.service;

import java.net.URI;
import java.net.URISyntaxException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

@Service
public class MyService {

	@Autowired
	private RestTemplate restTemplate;
	
	/**
	 * Please read the comments on MyConfigs.java
	 * 
	 * @return
	 * @throws RestClientException
	 * @throws URISyntaxException
	 */
	
	public String getWorld() throws RestClientException, URISyntaxException {
		return restTemplate.getForObject(new URI("https://SPRING-PCF-EUREKA-CLIENT/hello/world"), String.class);
	}
	
}
