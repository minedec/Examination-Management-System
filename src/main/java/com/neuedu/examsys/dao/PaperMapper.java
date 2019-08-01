package com.neuedu.examsys.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.neuedu.examsys.domain.Papers;

/**
 * 试卷数据交互层，提供试卷基本增删查改
 * @author jjd
 */
@Mapper
public interface PaperMapper {
	
	void insertPaper(Papers paper);
	
	Papers queryPaperById(int id);
	
	List<Papers> queryPaperByName(String name);
	
	void deleteParperById(int id);
	
	void updatePaper(Papers paper);
}
