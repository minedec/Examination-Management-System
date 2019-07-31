package com.neuedu.examsys.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.neuedu.examsys.service.BanjiService;
import com.neuedu.examsys.dao.BanjiMapper;

@Service
public class BanjiServiceImpl implements BanjiService {
	
	@Autowired
	private BanjiMapper mapper;

	@Override
	public void delete(Integer bjid) {
		System.out.println("Trigger Service");
		mapper.deleteBanji(bjid);
	}
	
	
}
