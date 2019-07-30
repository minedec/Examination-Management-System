package com.neuedu.examsys.domain;

public class Teacher {
	String teacherId;
	byte[] teacherIcon;
	String teacherName;
	String teacherSex;
	String teacherNation;
	String teacherEmail;
	String teacherIdentity;
	String teacherAddress;
	String teacherPhone;
	public String getTeacherId() {
		return teacherId;
	}
	public void setTeacherId(String teacherId) {
		this.teacherId = teacherId;
	}
	public byte[] getTeacherIcon() {
		return teacherIcon;
	}
	public void setTeacherIcon(byte[] teacherIcon) {
		this.teacherIcon = teacherIcon;
	}
	public String getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	public String getTeacherSex() {
		return teacherSex;
	}
	public void setTeacherSex(String teacherSex) {
		this.teacherSex = teacherSex;
	}
	public String getTeacherNation() {
		return teacherNation;
	}
	public void setTeacherNation(String teacherNation) {
		this.teacherNation = teacherNation;
	}
	public String getTeacherEmail() {
		return teacherEmail;
	}
	public void setTeacherEmail(String teacherEmail) {
		this.teacherEmail = teacherEmail;
	}
	public String getTeacherIdentity() {
		return teacherIdentity;
	}
	public void setTeacherIdentity(String teacherIdentity) {
		this.teacherIdentity = teacherIdentity;
	}
	public String getTeacherAddress() {
		return teacherAddress;
	}
	public void setTeacherAddress(String teacherAddress) {
		this.teacherAddress = teacherAddress;
	}
	public String getTeacherPhone() {
		return teacherPhone;
	}
	public void setTeacherPhone(String teacherPhone) {
		this.teacherPhone = teacherPhone;
	}
	@Override
	public String toString() {
		return "Teacher [teacherId=" + teacherId + ", teacherName=" + teacherName + ", teacherSex=" + teacherSex
				+ ", teacherNation=" + teacherNation + ", teacherEmail=" + teacherEmail + ", teacherIdentity="
				+ teacherIdentity + ", teacherAddress=" + teacherAddress + ", teacherPhone=" + teacherPhone + "]";
	}
	
}
