package com.neuedu.examsys.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neuedu.examsys.domain.Option;
import com.neuedu.examsys.domain.Question;
import com.neuedu.examsys.dao.*;

@Service
public class OptionServiceImpl implements OptionService {

	@Autowired
	private OptionMapper optionMapper;
	
	@Override
	public void insertOption(Option option) {
		// TODO Auto-generated method stub

		optionMapper.insertOption(option);
	}

	@Override
	public void deleteOption(Integer optionId) {
		// TODO Auto-generated method stub

		optionMapper.deleteOption(optionId);
	}

	@Override
	public void updateOption(Option option) {
		// TODO Auto-generated method stub

		optionMapper.updateOption(option);
	}

	@Override
	public List<Question> selectOptionByquestionId(Integer questionId) {
		return optionMapper.selectOptionByQuestionId(questionId);
	}

}
