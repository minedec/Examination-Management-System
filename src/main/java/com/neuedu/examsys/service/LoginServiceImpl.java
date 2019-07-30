package com.neuedu.examsys.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neuedu.examsys.dao.AccountMapper;
import com.neuedu.examsys.domain.Account;
import com.neuedu.examsys.domain.Role;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	private AccountMapper loginmapper;
	
	@Override
	public Role getRole(String id, String pwd) throws Exception {
		System.out.println("service" + id);
		Account ac = loginmapper.queryAccountById(id);
		System.out.println(ac);
		if(ac != null && ac.getPwd().equals(pwd)) {
			return ac.getRole();
		}
		return null;
	}
	
}
