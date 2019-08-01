package com.neuedu.examsys.service;

import java.util.List;

import com.neuedu.examsys.domain.Question;

public interface PaperQuestionService {
	List<Question> queryQuestions(int paperId);
}
