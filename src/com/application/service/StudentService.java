package com.application.service;

import java.util.List;

import com.application.entity.Student;

public interface StudentService {
	public void saveStudentObj(Student Student);
	public List<Student> getAllStudent();
	public Student getStudentObj(int id);
	public void removeStudentObj(int id);
}
