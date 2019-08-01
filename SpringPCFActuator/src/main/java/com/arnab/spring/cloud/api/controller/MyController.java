package com.arnab.spring.cloud.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arnab.spring.cloud.api.service.MyService;

@RestController
@RequestMapping(value = "/hello")
public class MyController {

	@Autowired
	private MyService service;
	
	@GetMapping(value = "/world")
	public String getWorld() {
		return service.getWorld();
	}
	
}
