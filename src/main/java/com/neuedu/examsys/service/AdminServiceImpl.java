package com.neuedu.examsys.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.neuedu.examsys.dao.StudentMapper;
import com.neuedu.examsys.dao.TeacherMapper;

public class AdminServiceImpl implements AdminService {
	
	@Autowired
	private StudentMapper studentMapper;
	private TeacherMapper teacherMapper;
	
	@Override
	public void addStudent() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addTeacher() {
		// TODO Auto-generated method stub

	}

}
