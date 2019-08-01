package com.neuedu.examsys.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.neuedu.examsys.domain.Exams;

/**
 * 为学生提供的Exam数据交互接口
 * @author jjd
 *
 */
@Mapper
public interface ExamForStudentMapper {
	
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
	
}
