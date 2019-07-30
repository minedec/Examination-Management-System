package com.neuedu.examsys.domain;

import java.util.HashMap;
import java.util.Map;

public enum QuestionType {

	MULTIPLE("multiple","多选"),
	SINGLE("single","单选"),
	JUDGE("judge","判断"),
	FILL("fill","填空"),
	TOPIC("topic","主观");
	
	public static Map<String, QuestionType> getExamtypeMap() {
		return questiontypeMap;
	}

	public static void setExamtypeMap(Map<String, QuestionType> examtypeMap) {
		QuestionType.questiontypeMap = examtypeMap;
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
	private static Map<String, QuestionType> questiontypeMap = new HashMap();
	
	private QuestionType(String key, String value) {
		this.key = key;
		this.value = value;
	}
	
	//存储字符串与枚举类型的对应关系
	static {
		for(QuestionType questiontype : QuestionType.values()) {
			questiontypeMap.put(questiontype.getKey(), questiontype);
		}
	}
	
	public static QuestionType getExamTypeByKey(String key) {
		return questiontypeMap.get(key);
	}
}
