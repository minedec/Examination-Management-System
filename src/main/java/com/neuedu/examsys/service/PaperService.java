package com.neuedu.examsys.service;

import java.util.List;

import com.neuedu.examsys.domain.Papers;

/**
 * 
 * @author jjd
 *
 */
public interface PaperService {
	void insertPaper(Papers paper);
	
	Papers queryPaperById(int id);
	
	List<Papers> queryPaperByName(String name);
	
	void deleteParperById(int id);
	
	void updatePaper(Papers paper);
}
