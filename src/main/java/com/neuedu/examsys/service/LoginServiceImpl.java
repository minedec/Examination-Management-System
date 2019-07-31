package com.neuedu.examsys.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neuedu.examsys.dao.AccountMapper;
import com.neuedu.examsys.domain.Account;
import com.neuedu.examsys.domain.Role;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	private AccountMapper accountMapper;
	
	@Override
	public Role getRole(String id, String pwd) throws Exception {
		Account ac = accountMapper.queryAccountById(id);
		System.out.println(ac);
		if(ac != null && ac.getPwd().equals(pwd)) {
			return ac.getRole();
		}
		return null;
	}

	@Override
	public Account queryAccountById(String id) throws Exception {
		return accountMapper.queryAccountById(id);
	}

	@Override
	public List<Account> queryAccountByRole(Role role) throws Exception {
		return accountMapper.queryAccountByRole(role);
	}

	@Override
	public void insertAccount(Account ac) throws Exception {
		accountMapper.insertAccount(ac);
	}

	@Override
	public void deleteAccount(String id) throws Exception {
		accountMapper.deleteAccount(id);
	}

	@Override
	public void modifyAccountPwdById(String id, String newPwd) throws Exception {
		accountMapper.modifyAccountPwdById(id, newPwd);
	}

	@Override
	public void modifyAccountRoleById(String id, Role newRole) throws Exception {
		accountMapper.modifyAccountRoleById(id, newRole);
	}
	
}
