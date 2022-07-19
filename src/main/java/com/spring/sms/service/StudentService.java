package com.spring.sms.service;

import java.util.List;

import com.spring.sms.entity.Student;

public interface StudentService {
	List<Student> getAllStudents();
	
	Student addStudent(Student student);
	
	Student getStudent(Long id);
	
	Student editStudent(Student student);
	
	void deleteStudent(Long id);
}