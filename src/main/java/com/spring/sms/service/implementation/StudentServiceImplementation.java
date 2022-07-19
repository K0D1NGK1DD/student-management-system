package com.spring.sms.service.implementation;

import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.sms.entity.Student;
import com.spring.sms.repository.StudentRepository;
import com.spring.sms.service.StudentService;

@Service
public class StudentServiceImplementation implements StudentService{

	private StudentRepository studentRepository;
	
	public StudentServiceImplementation(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}

	@Override
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}

	@Override
	public Student addStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public Student getStudent(Long id) {
		return studentRepository.findById(id).get();
	}

	@Override
	public Student editStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public void deleteStudent(Long id) {
		studentRepository.deleteById(id);	
	}

}