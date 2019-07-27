package com.neuedu.examsys.domain;

public class BanJi {
	private Integer classId;
	private String className;
	
	public Integer getClassId() {
		return classId;
	}
	
	public void setClassId(Integer classId) {
		this.classId = classId;
	}
	
	public String getClassName() {
		return className;
	}
	
	public void setClassName(String className) {
		this.className = className;
	}

	public BanJi() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BanJi(Integer classId, String className) {
		super();
		this.classId = classId;
		this.className = className;
	}

	@Override
	public String toString() {
		return "BanJi [classId=" + classId + ", className=" + className + "]";
	}
	
	
	
	
}
