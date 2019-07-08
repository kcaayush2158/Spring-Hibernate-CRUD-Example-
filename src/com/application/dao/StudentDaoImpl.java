package com.application.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.application.entity.Student;

@Repository
public class StudentDaoImpl implements StudentDao{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void saveStudentObj(Student studentObj) {
		sessionFactory.getCurrentSession().saveOrUpdate(studentObj);	
	}

	@Override
	public List<Student> getAllStudent() {
	Session session = sessionFactory.getCurrentSession();
	List<Student> theQuery = session.createQuery("fromStudent").list();
		return theQuery;
	}

	@Override
	public Student getStudentObj(int id) {
		Student student = (Student) sessionFactory.getCurrentSession().get(Student.class, id);
		return student;
	}

	@Override
	public void removeStudentOng(int id) {
		Student student = (Student) sessionFactory.getCurrentSession().get(Student.class, id);
		sessionFactory.getCurrentSession().delete(student);
		
	}

}
