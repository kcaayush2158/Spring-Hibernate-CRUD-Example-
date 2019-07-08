package com.application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.application.entity.Student;
import com.application.service.StudentService;

@Controller
@RequestMapping(value="/")
public class StudentController {
	
	@Autowired 
	 StudentService studentService;
	
	@RequestMapping(value="/addStudent",method=RequestMethod.GET)
	public String addStudent(Model model) {
		Student student = new Student();
		model.addAttribute("student",student);
		return "AddStudent";
	}
	
	@RequestMapping(value="/saveProcess",method=RequestMethod.GET)
	public String saveStudentObj(@ModelAttribute("student") Student student) {
		studentService.saveStudentObj(student);
		return "redirect:/student/list";
	}
	
	@RequestMapping("/list")
	public String listOfStudent(@RequestParam("studentId") int id , Model model) {
		model.addAttribute("studentList");
		return "list-student";
	}
	@RequestMapping("/displayUpdateForm")
	public String showUpdateForm(@RequestParam("StudentId") int id ,Model model){
		model.addAttribute("student", studentService.getStudentObj(id));
		return "student-form";
	}
	
	@RequestMapping("/displayDeletedForm")
	public String showDeletedForm(@RequestParam("StudentId") int id ,Model model){
		 studentService.removeStudentObj(id);
		return "redirect:/student/list";
	}
}
