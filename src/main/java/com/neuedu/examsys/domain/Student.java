package com.neuedu.examsys.domain;

public class Student {
	String studentId;
	byte[] studentIcon;
	String studentName;
	String studentSex;
	String studentNation;
	String studentEmail;
	String studentIdentity;
	String studentAddress;
	String studentPhone;
	String studentClass;
	String studentAcademy;
	String studentMajor;
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public byte[] getStudentIcon() {
		return studentIcon;
	}
	public void setStudentIcon(byte[] studentIcon) {
		this.studentIcon = studentIcon;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentSex() {
		return studentSex;
	}
	public void setStudentSex(String studentSex) {
		this.studentSex = studentSex;
	}
	public String getStudentNation() {
		return studentNation;
	}
	public void setStudentNation(String studentNation) {
		this.studentNation = studentNation;
	}
	public String getStudentEmail() {
		return studentEmail;
	}
	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}
	public String getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}
	public String getStudentPhone() {
		return studentPhone;
	}
	public void setStudentPhone(String studentPhone) {
		this.studentPhone = studentPhone;
	}
	public String getStudentClass() {
		return studentClass;
	}
	public void setStudentClass(String studentClass) {
		this.studentClass = studentClass;
	}
	public String getStudentAcademy() {
		return studentAcademy;
	}
	public void setStudentAcademy(String studentAcademy) {
		this.studentAcademy = studentAcademy;
	}
	public String getStudentMajor() {
		return studentMajor;
	}
	public void setStudentMajor(String studentMajor) {
		this.studentMajor = studentMajor;
	}
	
	public String getStudentIdentity() {
		return studentIdentity;
	}
	public void setStudentIdentity(String studentIdentity) {
		this.studentIdentity = studentIdentity;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentSex=" + studentSex
				+ ", studentNation=" + studentNation + ", studentEmail=" + studentEmail + ", studentAddress="
				+ studentAddress + ", studentPhone=" + studentPhone + ", studentClass=" + studentClass
				+ ", studentAcademy=" + studentAcademy + ", studentMajor=" + studentMajor + "]";
	}
	
}
