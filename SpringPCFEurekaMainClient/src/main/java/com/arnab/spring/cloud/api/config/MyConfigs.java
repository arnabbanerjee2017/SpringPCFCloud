/*
 * Copyright (c) 2019, ARNAB BANERJEE. All rights reserved.
 * 
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted only for academic purposes.
 * 
 * For further queries / info: arnab.ban09@gmail.com
 */

package com.arnab.spring.cloud.api.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class MyConfigs {

	/**
	 * This is a Configuration class. This creates a bean of RestTemplate, which autowired in the Service class.
	 * This class will work generally. But in our case, we deployed the Eureka Server and Client application in the Pivotal
	 * Cloud Foundry (PCF) Cloud. And PCF deployed the applications using https. Although the Eureka is working perfectly
	 * using the defaultZone serviceUrl. But here, this client is deployed on a local system - localhost. And that's why,
	 * whenever RestTemplate is trying to access the client via Eureka server from this application, there is server SSL mismatch.
	 * So it will throw error mentioning javax.net.ssl.SSLException: Unrecognized SSL message, plaintext connection?
	 * It is because you are calling an https endpoint from an non-secure http endpoint. And the SSL message is not recognized.
	 * If everything runs on http, it will work fine. Same for https.
	 * Currently I am working on this. Will modify as per my need to work with both http and https.
	 * 
	 * @return
	 */
	
	@Bean
	@LoadBalanced
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

}
