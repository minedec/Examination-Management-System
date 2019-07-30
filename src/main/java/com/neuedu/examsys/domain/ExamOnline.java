package com.neuedu.examsys.domain;

import java.util.HashMap;
import java.util.Map;

//考试方式枚举类，用来保存是线下/线上类型  7.29 16:30 zjy

public enum ExamOnline {
	ONLINE("online","线上"),
	OFFLINE("offline","线下");
	
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

	public static Map<String, ExamOnline> getExamonlineMap() {
		return examonlineMap;
	}

	public static void setExamonlineMap(Map<String, ExamOnline> examonlineMap) {
		ExamOnline.examonlineMap = examonlineMap;
	}

	private String key;
	private String value;
	private static Map<String, ExamOnline> examonlineMap = new HashMap();
	
	private ExamOnline(String key, String value) {
		this.key = key;
		this.value = value;
	}
	
	//存储字符串与枚举类型的对应关系
	static {
		for(ExamOnline examonline : ExamOnline.values()) {
			examonlineMap.put(examonline.getKey(), examonline);
		}
	}
	
	public static ExamOnline getExamOnlineByKey(String key) {
		return examonlineMap.get(key);
	}
}
