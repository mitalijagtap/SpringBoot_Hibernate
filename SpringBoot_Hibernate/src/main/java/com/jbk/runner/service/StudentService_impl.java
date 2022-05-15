package com.jbk.runner.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jbk.runner.dao.StudentDao;
import com.jbk.runner.entity.Student;

@Service
public class StudentService_impl implements StudentService {

	
	@Autowired 
	private StudentDao dao;
//	internally asa hot
//	StudentDao dao=new StudentDao_impl();
	
	@Override
	public Student saveStudent(Student student) {
		
		String StudentId=new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
		student.setStudentId(StudentId);
		Student std=dao.saveStudent(student);
		return std;
	}

	@Override
	public Student getStudentById(String studentId) {
		Student s1=dao.getStudentById(studentId);
		return s1;
	}

	@Override
	public List<Student> getAllStudent() {
		List<Student> s2= dao.getAllStudent();
		return s2;
	}

	@Override
	public boolean deleteStudentById(String studentId) {
		boolean s3=dao.deleteStudentById(studentId);
		return s3;
	}

	@Override
	public Student updateStudent(Student student) {
		Student s4=dao.updateStudent(student);
		return s4;
	}

}
