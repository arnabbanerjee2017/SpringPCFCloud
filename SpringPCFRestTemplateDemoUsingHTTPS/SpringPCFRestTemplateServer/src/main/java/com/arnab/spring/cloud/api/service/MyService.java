package com.arnab.spring.cloud.api.service;

import org.springframework.stereotype.Service;

import com.arnab.spring.cloud.api.entity.Laptop;

@Service
public class MyService {

	public Laptop getLaptop() {
		return new Laptop("HP", "15TU", "100051", 22999.00, "Core i3", "8 GB", "1 TB");
	}
	
}
