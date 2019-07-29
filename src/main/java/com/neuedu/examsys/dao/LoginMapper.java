package com.neuedu.examsys.dao;

import org.apache.ibatis.annotations.Mapper;

import com.neuedu.examsys.domain.Account;

@Mapper
public interface LoginMapper {
	
	/**
	 * 通过ID查找账户
	 * @param id ID
	 * @return 账户类
	 * @throws Exception
	 */
	Account queryAccountById(String id) throws Exception;
}
