package com.myssm.service;

import com.myssm.dao.IStudentDao;
import com.myssm.entity.Student;

public class StudentServiceImpl implements IStudentService {

	private IStudentDao dao;

	public void setDao(IStudentDao dao) {
		this.dao = dao;
	}

	public void addStudent(Student student) {
		dao.insertSudent(student);
	}

}
