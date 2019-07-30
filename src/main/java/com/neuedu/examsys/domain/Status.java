package com.neuedu.examsys.domain;

import java.util.HashMap;
import java.util.Map;

//考试状态枚举类 分为completed/ongoing/unstart 7.30 10:15 zjy

public enum Status {
	COMPLETED("completed","已完成"),
	ONGOING("ongoing","进行中"),
	UNSTART("unstart","未开始");
	
	private String key;
	private String value;
	private static Map<String, Status> statusMap = new HashMap();
	
	private Status(String key, String value) {
		this.key = key;
		this.value = value;
	}
	
	static {
		for(Status status : Status.values()) {
			statusMap.put(status.getKey(), status);
		}
	}
	
	public static Status getStatusByKey(String key) {
		return statusMap.get(key);
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
