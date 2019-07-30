package com.neuedu.examsys.dao;

import java.util.List;

import com.neuedu.examsys.domain.Student;

public interface TeacherMapper {
	public void insertStudent(Student s);
	public List<Student> queryStudent();
	public List<Student> selectStudent(Integer id);
	public void deleteStudent(String string);
	public void updateStudent(Student s);
}
