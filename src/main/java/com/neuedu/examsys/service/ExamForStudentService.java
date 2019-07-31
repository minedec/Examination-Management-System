package com.neuedu.examsys.service;

import java.util.List;

import com.neuedu.examsys.domain.Exams;

public interface ExamForStudentService {
	/**
	 * 查询所有在当前时间之后学生的考试安排
	 * @param studentId 学生ID
	 * @return 一组考试对象
	 */
	List<Exams> queryExamsAfterNow(String studentId);
	
	/**
	 * 查询所有在当前时间之前学生的考试安排
	 * @param studentId 学生ID
	 * @return 一组考试对象
	 */
	List<Exams> queryExamsBeforeNow(String studentId);
}
