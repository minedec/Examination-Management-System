package com.neuedu.examsys.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neuedu.examsys.dao.QuestionMapper;
import com.neuedu.examsys.domain.Question;

@Service
public class QuestionServiceImpl implements QuestionService {

	@Autowired
	private QuestionMapper mapper;
	
	@Override
	public void insert(Question question) {
		// TODO Auto-generated method stub
		System.out.println("Trigger Service");
		mapper.insertQuestion(question);
	}

	@Override
	public List<Question> select() {
		// TODO Auto-generated method stub
		System.out.println("Trigger Service");
		List<Question> questions = mapper.selectQuestion();
		for(Question q:questions){
			System.out.println(q.toString());
		}
		return questions;
	}

	@Override
	public Integer queryId(Question question) {
		System.out.println("Trigger Service");
		return mapper.queryId(question);
	}

	
}
