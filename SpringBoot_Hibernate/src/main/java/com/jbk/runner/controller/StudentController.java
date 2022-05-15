package com.jbk.runner.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jbk.runner.entity.Student;
import com.jbk.runner.service.StudentService;

@RestController

public class StudentController {

	@Autowired
	private StudentService service;
	
	@PostMapping(value="/saveStudent")
	public ResponseEntity<Student> saveStudent(@RequestBody Student student){
		
		Student std=service.saveStudent(student);
		if(std!=null) {
		return new ResponseEntity<>(std,HttpStatus.CREATED);
		}
		else {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
			
		}
	}
	
	
	@GetMapping(value="/getStudentById/{studentId}")
	public ResponseEntity<Student> getStudentById(@PathVariable String studentId){
		
		Student s1=service.getStudentById(studentId);
		Student std=service.saveStudent(s1);
		if(s1!=null) {
			return new ResponseEntity<>(std,HttpStatus.OK);
			}
			else {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
				
			}
	}
	
	
	@GetMapping(value="/getAllStudent")
	public ResponseEntity<List<Student>> getAllStudent(@RequestBody Student student){
		
		List<Student> s2=service.getAllStudent();
		if(s2!=null) {
			return new ResponseEntity<>(s2,HttpStatus.OK);
			}
			else {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
				
			}
		
		
	}
	
	@DeleteMapping(value="/deleteStudentById/{studentId}")
	public boolean  deleteStudentById (@PathVariable String studentId) {
		
		boolean s3= service.deleteStudentById(studentId);
		
		
				return true; 
			}
				
			
	
	@PutMapping(value="/updateStudent")
	public ResponseEntity<Student> updateStudent(@RequestBody Student student) {
		
		Student s4=service.updateStudent(student);
		
		return new ResponseEntity<>(s4,HttpStatus.OK);
	}
	
	
	
	
	
}
