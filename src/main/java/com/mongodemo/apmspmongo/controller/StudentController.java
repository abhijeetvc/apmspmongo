package com.mongodemo.apmspmongo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mongodemo.apmspmongo.model.Student;
import com.mongodemo.apmspmongo.repository.StudentRepository;

@RestController
public class StudentController {
	
	@Autowired
	private StudentRepository studentRepository;
	
	@PostMapping("/save")
	public String saveStudent(@RequestBody Student student) {
		studentRepository.save(student);
		return "Student saved";
	}
	
	@GetMapping("/getstudent/{id}")
	public Optional<Student> getStudent(@PathVariable String id) {
		return studentRepository.findById(id);
	}
	
	@GetMapping("/getallstudents")
	public List<Student> getAllStudents(){
		return studentRepository.findAll();
	}
	
}
