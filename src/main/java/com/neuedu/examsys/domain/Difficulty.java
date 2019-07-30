package com.neuedu.examsys.domain;

import java.util.HashMap;
import java.util.Map;

public enum Difficulty {

	HARD("hard","困难"),MIDDLE("middle","中等"),EASY("easy","简单");
	
	public static Map<String, Difficulty> getDifficultyMap() {
		return difficultyMap;
	}

	public static void setDifficultyMap(Map<String, Difficulty> difficultyMap) {
		Difficulty.difficultyMap = difficultyMap;
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
	private static Map<String, Difficulty> difficultyMap = new HashMap();
	
	private Difficulty(String key, String value) {
		this.key = key;
		this.value = value;
	}
	
	//存储字符串与枚举类型的对应关系
	static {
		for(Difficulty difficulty : Difficulty.values()) {
			difficultyMap.put(difficulty.getKey(), difficulty);
		}
	}
	
	public static Difficulty getDifficultyByKey(String key) {
		return difficultyMap.get(key);
	}
}
