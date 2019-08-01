package com.arnab.spring.cloud.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arnab.spring.cloud.api.dao.StudentDao;
import com.arnab.spring.cloud.api.entity.Student;

@Service
public class MyService {

	@Autowired
	private StudentDao dao;
		
	public String getVal() {
		return "Hello I am from PCF!";
	}
	
	public Student getStudent(int id) {
		return dao.getStudent(id);
	}
	
	public int saveStudent(Student student) {
		return dao.saveStudent(student);
	}
	
}
