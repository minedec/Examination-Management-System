package com.neuedu.examsys.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.neuedu.examsys.domain.Exams;

@Mapper
public interface ExamForAdminMapper {
	public void insertExam(Exams s);
	public List<Exams> selectAllExam();
	public List<Exams> selectExam(Integer id);
	public void deleteExam(Integer id);
	public void updateExam(Exams s);
}
