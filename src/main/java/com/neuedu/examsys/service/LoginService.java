package com.neuedu.examsys.service;

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
	
}
