package com.myssm.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.myssm.entity.Student;
import com.myssm.service.IStudentService;

public class StudentController implements Controller{
	
	private IStudentService service;

	public void setService(IStudentService service) {
		this.service = service;
	}

	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		String name = request.getParameter("name"); 
		Integer age = Integer.valueOf(request.getParameter("age"));
		Student student = new Student(name,age);
		
		service.addStudent(student);
		
		return new ModelAndView("/welcome.jsp");
	}

}
