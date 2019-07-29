package com.neuedu.examsys.domain;

/**
 * 账户类，作为ORM的模型类用于MySQL查询
 * @author jjd
 */
public class Account {
	private String id;
	private String pwd;
	private Role role;
	
	
	public Account(String id, String pwd, Role role) {
		super();
		this.id = id;
		this.pwd = pwd;
		this.role = role;
	}
	
	
	public Account() {
		super();
	}


	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}


	@Override
	public String toString() {
		return "Account [id=" + id + ", pwd=" + pwd + ", role=" + role + "]";
	}
	
	
}
