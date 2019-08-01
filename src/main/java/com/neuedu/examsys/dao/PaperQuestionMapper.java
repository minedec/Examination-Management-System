package com.neuedu.examsys.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.neuedu.examsys.domain.Question;

/**
 * 
 * @author jjd
 *
 */
@Mapper
public interface PaperQuestionMapper {
	
	List<Question> queryQuestions(int paperId);
}
