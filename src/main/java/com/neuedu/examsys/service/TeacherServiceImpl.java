package com.neuedu.examsys.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neuedu.examsys.dao.TeacherMapper;
import com.neuedu.examsys.domain.Teacher;

@Service
public class TeacherServiceImpl implements TeacherService {
	
	@Autowired
	private TeacherMapper teacherMapper;
	
	@Override
	public void insertTeacher(Teacher s) {
		teacherMapper.insertTeacher(s);
	}

	@Override
	public List<Teacher> queryTeacher() {
		return teacherMapper.queryTeacher();
	}

	@Override
	public Teacher selectTeacher(String id) {
		List<Teacher> slist = teacherMapper.selectTeacher(id);
		if (slist.isEmpty()) {
			return null;
		}
		return teacherMapper.selectTeacher(id).get(0);
	}

	@Override
	public void deleteTeacher(String id) {
		teacherMapper.deleteTeacher(id);
	}

	@Override
	public void updateTeacher(Teacher s) {
		teacherMapper.updateTeacher(s);
	}

}
