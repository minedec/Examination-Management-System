package com.neuedu.examsys.domain;

import java.util.HashMap;
import java.util.Map;

//考试结果枚举类：unpass/pass	7.30 10:00 zjy

public enum Result {
	UNPASS("unpass","未通过"),
	PASS("pass","通过");
	

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
	private static Map<String, Result> resultMap = new HashMap();
	
	private Result(String key, String value) {
		this.key = key;
		this.value = value;
	}
	
	static {
		for(Result result : Result.values()) {
			resultMap.put(result.getKey(), result);
		}
	}
	
	public static Result getResultByKey(String key) {
		return resultMap.get(key);
	}
}
