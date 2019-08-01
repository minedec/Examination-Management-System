package com.neuedu.examsys.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neuedu.examsys.dao.PaperMapper;
import com.neuedu.examsys.domain.Papers;

@Service
public class PaperServiceImpl implements PaperService {

	@Autowired
	private PaperMapper paperMapper;
	
	@Override
	public void insertPaper(Papers paper) {
		paperMapper.insertPaper(paper);
	}

	@Override
	public Papers queryPaperById(int id) {
		return paperMapper.queryPaperById(id);
	}

	@Override
	public List<Papers> queryPaperByName(String name) {
		return paperMapper.queryPaperByName(name);
	}

	@Override
	public void deleteParperById(int id) {
		paperMapper.deleteParperById(id);
	}

	@Override
	public void updatePaper(Papers paper) {
		paperMapper.updatePaper(paper);
	}

}
