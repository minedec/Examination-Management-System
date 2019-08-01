package com.neuedu.examsys.service;

import java.util.List;

import com.neuedu.examsys.domain.Option;
import com.neuedu.examsys.domain.Question;

public interface OptionService {

    void insertOption(Option option);
	
	void deleteOption(Integer optionId);
	
	void updateOption(Option option);
	
	List<Question> selectOptionByquestionId(Integer questionId);
}
