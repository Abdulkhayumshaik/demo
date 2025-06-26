package com.springboot.examples.sms.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.examples.entity.Student;

@Service
public interface StudentService {
	List<Student> getAllStudents();
	
	Student saveStudent(Student student);

}
