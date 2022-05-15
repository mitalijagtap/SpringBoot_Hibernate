package com.jbk.runner.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jbk.runner.entity.Student;

@Repository
public class StudentDao_impl implements StudentDao {

	@Autowired
	private SessionFactory factory;

	@Override
	public Student saveStudent(Student student) {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();

		try {
			session.save(student);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			session.close();
		}

		return student;
	}

	@Override
	public Student getStudentById(String studentId) {

		Session session = factory.openSession();
		Student s1 = null;
		try {
			s1 = session.get(Student.class, studentId);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return s1;
	}

	@Override
	public List<Student> getAllStudent() {

		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		List<Student> s2 = null;
		
		try {

			session.save(s2);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			session.close();
		}

		return s2;
	}

	
	
	@Override
	public boolean deleteStudentById(String studentId) {

		return false;
	}

	@Override
	public Student updateStudent(Student student) {

		return null;
	}

}
