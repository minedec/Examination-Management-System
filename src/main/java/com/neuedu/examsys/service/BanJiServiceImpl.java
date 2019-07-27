package com.neuedu.examsys.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neuedu.examsys.dao.BanJiMapper;

@Service
public class BanJiServiceImpl implements BanJiService {
	
	@Autowired
	private BanJiMapper mapper;

	@Override
	public void delete(Integer bjid) {
		System.out.println("Trigger Service");
		mapper.deleteBanJi(bjid);
	}
	
	
}
