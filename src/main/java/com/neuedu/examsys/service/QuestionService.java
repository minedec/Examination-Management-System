package com.neuedu.examsys.service;

import java.util.List;

import com.neuedu.examsys.domain.Question;

public interface QuestionService {

	void insert(Question question);
	
	List<Question> select();
}
