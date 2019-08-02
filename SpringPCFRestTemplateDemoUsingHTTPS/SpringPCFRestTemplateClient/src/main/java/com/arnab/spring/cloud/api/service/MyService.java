package com.arnab.spring.cloud.api.service;

import java.net.URI;
import java.net.URISyntaxException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import com.arnab.spring.cloud.api.entity.Laptop;

@Service
public class MyService {

	@Autowired
	private RestTemplate restTemplate;
	
	public Laptop getLaptop() throws RestClientException, URISyntaxException {
		return restTemplate.getForObject(new URI("https://spring-pcf-rest-template-server-restless-buffalo.cfapps.io/digital/laptop"), Laptop.class);
	}
	
}
