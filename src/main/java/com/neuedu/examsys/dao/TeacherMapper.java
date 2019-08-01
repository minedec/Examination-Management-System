package com.neuedu.examsys.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.neuedu.examsys.domain.Teacher;

@Mapper
public interface TeacherMapper {
	public void insertTeacher(Teacher s);
	public List<Teacher> queryTeacher();
	public List<Teacher> selectTeacher(String id);
	public void deleteTeacher(String string);
	public void updateTeacher(Teacher s);
}
