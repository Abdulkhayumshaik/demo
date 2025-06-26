package com.springboot.examples.sms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.springboot.examples.entity.Student;
import com.springboot.examples.sms.service.StudentService;

@Controller
public class StudentController {

	private StudentService studentService;

	public StudentController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}

	//Handler method to handle list of students and return model and view
	
	@GetMapping("/students")
	public String listOfStudent(Model model) {
		model.addAttribute("students", studentService.getAllStudents());
		return "students";
	}
	
	@GetMapping("/students/new")
	public String createStudentForm(Model model) {
		Student student = new Student();
		model.addAttribute("student", student);
		return "create_student";
	}
	
	public String saveStudent(@ModelAttribute("students") Student student) {
		studentService.saveStudent(student);
		return "redirect/students";
		
	}

}
