package com.neuedu.examsys.domain;

import java.util.HashMap;
import java.util.Map;

//考试类型枚举类，用来保存是正常/缓考/补考		7.29 16:25 zjy

public enum ExamType {
	NORMAL("normal","正常"),
	LATE("late","缓考"),
	MAKEUP("makeup","补考");
	

	public static Map<String, ExamType> getExamtypeMap() {
		return examtypeMap;
	}

	public static void setExamtypeMap(Map<String, ExamType> examtypeMap) {
		ExamType.examtypeMap = examtypeMap;
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


	private String key;
	private String value;
	private static Map<String, ExamType> examtypeMap = new HashMap();
	
	private ExamType(String key, String value) {
		this.key = key;
		this.value = value;
	}
	
	//存储字符串与枚举类型的对应关系
	static {
		for(ExamType examtype : ExamType.values()) {
			examtypeMap.put(examtype.getKey(), examtype);
		}
	}
	
	public static ExamType getExamTypeByKey(String key) {
		return examtypeMap.get(key);
	}
}
