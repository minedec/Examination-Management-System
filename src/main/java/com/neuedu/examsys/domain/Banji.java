package com.neuedu.examsys.domain;

public class Banji {
	String classId; //班级编号
	String className; //班级名称
	String grade; //年级
	String major; //专业
	public String getClassId() {
		return classId;
	}
	public void setClassId(String classId) {
		this.classId = classId;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	@Override
	public String toString() {
		return "Banji [classId=" + classId + ", className=" + className + ", grade=" + grade + ", major=" + major + "]";
	}
	
}
