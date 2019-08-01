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
	
	/**
	 * 获取考试持续时间
	 * @param examId 考试ID
	 * @return 考试持续时间
	 */
	int queryExanDuration(int examId);
	
	/**
	 * 通过考试ID查考试对象
	 * @param examId 考试ID
	 * @return
	 */
	Exams queryExamById(int examId);
	
	/**
	 * 检查当前的时间点是否在考试的时间范围内
	 * @param examId 考试ID
	 * @return
	 */
	boolean checkInTheTimeZone(int examId);
	
}
