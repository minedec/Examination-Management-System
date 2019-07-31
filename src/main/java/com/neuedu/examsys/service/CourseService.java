package com.neuedu.examsys.service;

import java.util.List;

import com.neuedu.examsys.domain.Course;

public interface CourseService {
	public void insertCourse(Course course);
	public List<Course> queryCourse();
	public List<Course> selectCourse(String id);
	public void deleteCourse(String id);
	public void updateCourse(Course course);
}
