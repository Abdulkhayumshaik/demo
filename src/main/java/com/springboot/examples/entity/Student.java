package com.springboot.examples.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "students")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	
	@Column(name = "first_name", nullable = false)
	private String fistName;
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "email_Id")
	private String emailId;
	
	@Column(name = "father_name")
	private String fatherName;
	
	
	public Student() {
		
	}
	public Student(Long id, String fistName, String lastName, String emailId, String fatherName) {
		super();
		Id = id;
		this.fistName = fistName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.fatherName = fatherName;
	}
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getFistName() {
		return fistName;
	}
	public void setFistName(String fistName) {
		this.fistName = fistName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	
	

}
