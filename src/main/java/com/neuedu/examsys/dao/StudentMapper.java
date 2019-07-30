package com.neuedu.examsys.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.neuedu.examsys.domain.Student;

@Mapper
public interface StudentMapper {
	public void insertStudent(Student s);
	public List<Student> queryStudent();
	public List<Student> selectStudent(String id);
	public void deleteStudent(String string);
	public void updateStudent(Student s);
}
