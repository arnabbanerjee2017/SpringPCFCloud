package com.arnab.spring.cloud.api.service;

import org.springframework.stereotype.Service;

@Service
public class MyService {

	public String getWorld() {
		return "<h1>Hello, New World!</h1>";
	}
	
}
