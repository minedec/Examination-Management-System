package com.neuedu.examsys.service;

import java.util.List;

import com.neuedu.examsys.domain.Account;
import com.neuedu.examsys.domain.Role;

public interface LoginService {
	
	/**
	 * 获取该账户ID的角色
	 * @param id 账户id
	 * @param pwd 账户密码
	 * @return 该id对应的角色，如果id错误或密码错误，返回null
	 * @throws Exception 
	 */
	Role getRole(String id, String pwd) throws Exception;
	
	/**
	 * 通过ID查找账户
	 * @param id ID
	 * @return 账户类
	 * @throws Exception
	 */
	Account queryAccountById(String id) throws Exception;
	
	/**
	 * 通过角色查询一组账户
	 * @param role
	 * @return
	 * @throws Exception
	 */
	List<Account> queryAccountByRole(Role role) throws Exception;
	
	/**
	 * 插入新账户
	 * @param ac
	 * @throws Exception
	 */
	void insertAccount(Account ac) throws Exception;
	
	/**
	 * 删除账户
	 * @param id
	 * @throws Exception
	 */
	void deleteAccount(String id) throws Exception;
	
	/**
	 * 通过ID修改账户密码
	 * @param id
	 * @param newPwd
	 * @throws Exception
	 */
	void modifyAccountPwdById(String id, String newPwd) throws Exception;
	
	/**
	 * 通过ID修改角色
	 * @param id
	 * @param newRole
	 * @throws Exception
	 */
	void modifyAccountRoleById(String id, Role newRole) throws Exception;
}
