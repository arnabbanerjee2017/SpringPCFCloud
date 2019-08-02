/*
 * Copyright (c) 2019, ARNAB BANERJEE. All rights reserved.
 * 
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted only for academic purposes.
 * 
 * For further queries / info: arnab.ban09@gmail.com
 */

package com.arnab.spring.cloud.api.service;

import org.springframework.stereotype.Service;

import com.arnab.spring.cloud.api.entity.Laptop;

@Service
public class MyService {

	public Laptop getLaptop() {
		return new Laptop("HP", "15TU", "100051", 22999.00, "Core i3", "8 GB", "1 TB");
	}
	
}
