package com.arnab.spring.cloud.api.controller;

import java.net.URISyntaxException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientException;

import com.arnab.spring.cloud.api.entity.Laptop;
import com.arnab.spring.cloud.api.service.MyService;

@RestController
@RequestMapping(value = "/digital")
public class MyController {

	@Autowired
	private MyService service;
	
	@GetMapping(value = "/laptop", produces = {MediaType.APPLICATION_JSON_VALUE})
	public Laptop getLaptop() throws RestClientException, URISyntaxException {
		return service.getLaptop();
	}
	
}
