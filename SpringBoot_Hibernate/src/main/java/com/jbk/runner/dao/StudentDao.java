package com.jbk.runner.dao;

import java.util.List;

import com.jbk.runner.entity.Student;

public interface StudentDao {

public Student saveStudent(Student student);
	
	public Student getStudentById(String studentId);
	
	public List<Student> getAllStudent();
	
	public boolean deleteStudentById (String studentId);
	
	public Student updateStudent (Student student);
}
