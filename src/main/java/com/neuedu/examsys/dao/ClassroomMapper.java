package com.neuedu.examsys.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.neuedu.examsys.domain.Classroom;

@Mapper
public interface ClassroomMapper {
	public void insertClassroom(Classroom cr);
	public List<Classroom> queryClassroom();
	public List<Classroom> selectClassroom(Integer id);
	public void deleteClassroom(Integer id);
	public void updateClassroom(Classroom cr);
}
