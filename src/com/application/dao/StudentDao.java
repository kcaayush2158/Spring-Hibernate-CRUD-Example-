package com.application.dao;

import java.util.List;

import com.application.entity.Student;

public interface StudentDao {
	public void saveStudentObj(Student studentObj);
	public List<Student> getAllStudent();
	public Student getStudentObj(int id);
	public void removeStudentOng(int id);

}
