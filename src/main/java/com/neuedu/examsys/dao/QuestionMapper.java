package com.neuedu.examsys.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.neuedu.examsys.domain.Question;

@Mapper
public interface QuestionMapper {

	void insertQuestion(Question question);
	
	void deleteQuestion(Integer questionId);
	
	void updateQuestion(Question question);
	
	List<Question> selectQuestion();
}
