package com.neuedu.examsys.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.neuedu.examsys.domain.AnsCollection;

/**
 * AnsCollection的数据交互层
 * @author jjd
 * @since 2019/7/29
 *
 */
@Mapper
public interface AnsCollectionMapper {
	
	/**
	 * 插入学生回答记录
	 * 
	 * @param ac AnsCollection对象，包含
	 * @param studentId 学生ID
	 * @param paperId 试卷ID
	 * @param examId 考试ID 
	 * @param questionId 问题ID
	 * @param qOption 学生的选项（如果是选择题，填空题，判断题）
	 * @param qContent 学生的回答（如果是主观题）
	 * @param score 分数(可选）
	 * @param isCorrect 是否正确（选择题）
	 * @param dateTime 做题时间
	 */
	void insertAns(AnsCollection ac);
	
	/**
	 * 更新学生回答成绩数据,批卷人信息
	 * 
	 * @param ac AnsCollection对象，包含学生，试卷，考试，题目ID和给分，批卷人
	 */
	void updateAnsScore(AnsCollection ac);
	
	/**
	 * 查询某场考试某个学生某张试卷某道题的分数
	 * @param ac AnsCollection对像，包含了学生ID，试卷ID，考试ID，问题ID
	 * @return 该题得分
	 */
	int queryScore(AnsCollection ac);
	
	/**
	 * 查询某场考试一张试卷上所有题目和分数的对应关系
	 * @param ac AnsCollection对象，包含学生ID，试卷ID，考试ID
	 * @return 题目编号和得分的映射表
	 */
	List<Map<Integer,Integer>> queryScores(AnsCollection ac);
	
	
}
