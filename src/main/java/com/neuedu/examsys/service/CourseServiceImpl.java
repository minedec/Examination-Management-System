package com.neuedu.examsys.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neuedu.examsys.dao.CourseMapper;
import com.neuedu.examsys.domain.Course;

@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	private CourseMapper courseMapper;
	
	@Override
	public void insertCourse(Course course) {
		courseMapper.insertCourse(course);
	}

	@Override
	public List<Course> queryCourse() {
		return courseMapper.queryCourse();
	}

	@Override
	public List<Course> selectCourse(String id) {
		return courseMapper.selectCourse(id);
	}

	@Override
	public void deleteCourse(String id) {
		courseMapper.deleteCourse(id);
	}

	@Override
	public void updateCourse(Course course) {
		courseMapper.updateCourse(course);

	}

}
