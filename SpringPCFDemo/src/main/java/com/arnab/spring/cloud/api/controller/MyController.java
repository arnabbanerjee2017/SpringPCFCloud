package com.arnab.spring.cloud.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arnab.spring.cloud.api.entity.Student;
import com.arnab.spring.cloud.api.service.MyService;

@RestController
@RequestMapping(value = "/pcf")
public class MyController {

	@Autowired
	private MyService service;
	
	@GetMapping(value = "/demo")
	public String getVal() {
		return service.getVal();
	}
	
	@GetMapping(value = "/get/{id}", produces = {MediaType.APPLICATION_JSON_VALUE})
	public Student getStudent(@PathVariable int id) {
		return service.getStudent(id);
	}
	
	@PostMapping(value = "/save", consumes = {MediaType.APPLICATION_JSON_VALUE})
	public String saveStudent(Student student) {
		return "STATUS: " + service.saveStudent(student);
	}
	
}
