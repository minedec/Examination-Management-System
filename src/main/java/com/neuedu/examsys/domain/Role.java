package com.neuedu.examsys.domain;

import java.util.HashMap;
import java.util.Map;

/**
 * 角色枚举类，保存管理员，老师和学生的角色
 * @author jjd
 *
 */
public enum Role {
	ADMINISTRATOR("ADMINISTRATOR","管理员"),
	STUDENT("STUDENT","学生"),
	TEACHER("TEACHER","老师");
	
	private String key;
	private String value;
	private static Map<String, Role> roleMap = new HashMap();
	
	//存储字符串与枚举类型的对应关系
	static {
		for(Role role : Role.values()) {
			roleMap.put(role.getKey(), role);
		}
	}
	
	private Role(String key, String value) {
		this.key = key;
		this.value = value;
	}
	
	public static Role getRoleByKey(String key) {
		return roleMap.get(key);
	}
	
	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
}
