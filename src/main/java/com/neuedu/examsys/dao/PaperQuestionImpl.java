package com.neuedu.examsys.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neuedu.examsys.domain.Question;
import com.neuedu.examsys.service.PaperQuestionService;

@Service
public class PaperQuestionImpl implements PaperQuestionService {

	
	@Autowired
	private PaperQuestionMapper pqMapper;
	
	@Override
	public List<Question> queryQuestions(int paperId) {
		return pqMapper.queryQuestions(paperId);
	}

}
