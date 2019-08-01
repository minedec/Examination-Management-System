package com.neuedu.examsys.service;

import java.util.List;

import com.neuedu.examsys.domain.Exams;

public interface ExamForAdminService {
	public List<Exams> selectAllExam();
	public void insertExam(Exams e);
	public void deleteExam(Integer id);
	public void updateExam(Exams e);
	public List<Exams> selectExam(Integer id);
}
