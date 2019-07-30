package com.neuedu.examsys.domain;

public class Classroom {
	int classroomId;
	String classroomName;
	public int getClassroomId() {
		return classroomId;
	}
	public void setClassroomId(int classroomId) {
		this.classroomId = classroomId;
	}
	public String getClassroomName() {
		return classroomName;
	}
	public void setClassroomName(String classroomName) {
		this.classroomName = classroomName;
	}
	@Override
	public String toString() {
		return "Classroom [classroomId=" + classroomId + ", classroomName=" + classroomName + "]";
	}
	
}
