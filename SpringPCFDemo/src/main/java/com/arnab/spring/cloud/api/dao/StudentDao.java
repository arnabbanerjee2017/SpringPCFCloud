package com.arnab.spring.cloud.api.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

import com.arnab.spring.cloud.api.entity.Student;

@Repository
public class StudentDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public Student getStudent(int id) {		
		return jdbcTemplate.query("SELECT ID, NAME, CITY FROM STUDENT WHERE ID=" + id, new ResultSetExtractor<Student>() {
			@Override
			public Student extractData(ResultSet rs) throws SQLException, DataAccessException {
				rs.next();
				return new Student(rs.getInt("ID"), rs.getString("NAME"), rs.getString("CITY"));
			}			
		});
	}
	
	public int saveStudent(Student student) {
		return jdbcTemplate.update("INSERT INTO STUDENT(ID, NAME, CITY) VALUES(" + student.getId() + ", '" 
				+ student.getName() + "', '" + student.getCity() + "')"); 
	}
	
}
