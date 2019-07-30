package com.neuedu.examsys.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neuedu.examsys.dao.StudentMapper;
import com.neuedu.examsys.domain.Student;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentMapper studentMapper;
	
	@Override
	public void insertStudent(Student s) {
		studentMapper.insertStudent(s);
	}

	@Override
	public List<Student> queryStudent() {
		return studentMapper.queryStudent();
	}

	@Override
	public Student selectStudent(String id) {
		List<Student> slist = studentMapper.selectStudent(id);
		if (slist.isEmpty()) {
			return null;
		}
		return studentMapper.selectStudent(id).get(0);
	}

	@Override
	public void deleteStudent(String id) {
		studentMapper.deleteStudent(id);
	}

	@Override
	public void updateStudent(Student s) {
		studentMapper.updateStudent(s);
	}

}
