package com.neuedu.examsys.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.neuedu.examsys.domain.Account;
import com.neuedu.examsys.domain.Role;

/**
 * 账户数据交互接口
 * @author jjd
 *
 */
@Mapper
public interface AccountMapper {
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
