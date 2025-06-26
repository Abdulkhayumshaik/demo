package com.springboot.examples.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.examples.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
