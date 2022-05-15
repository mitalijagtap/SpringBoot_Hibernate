package com.jbk.runner.service;

import java.util.List;

import com.jbk.runner.entity.Student;

public interface StudentService {
	
	public Student saveStudent(Student student);
	
	public Student getStudentById(String studentId);
	
	public List<Student> getAllStudent();
	
	public boolean deleteStudentById (String studentId);
	
	public Student updateStudent (Student student);

}
