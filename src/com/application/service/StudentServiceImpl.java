package com.application.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.application.dao.StudentDao;
import com.application.entity.Student;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentDao studentDao;
	
	@Override
	@Transactional
	public void saveStudentObj(Student Student) {
	 studentDao.saveStudentObj(Student);

	}

	@Override
	@Transactional
	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		return studentDao.getAllStudent();
	}

	@Override
	@Transactional
	public Student getStudentObj(int id) {
		// TODO Auto-generated method stub
		return studentDao.getStudentObj(id);
	}

	@Override
	@Transactional
	public void removeStudentObj(int id) {
		studentDao.removeStudentOng(id);
	}

}
