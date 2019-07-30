package com.neuedu.examsys.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.neuedu.examsys.domain.Option;
import com.neuedu.examsys.domain.Question;

@Mapper
public interface OptionMapper {
    void insertOption(Option option);
	
	void deleteOption(Integer optionId);
	
	void updateOption(Option option);
	
	List<Question> selectOption();
}
