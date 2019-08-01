package com.neuedu.examsys.domain;

import java.sql.Date;

//考试类，用于考试安排与查询	7.29 16:30 zjy

public class Exams {
	private ExamOnline examOnline;
	private ExamType examType;
	private Integer examID;
	private String examTitle;
	private String examDatetime; //需要把datetimr转换成String类型 rs.getTimestamp("insert_dt")
	private String examSemester;
	private Integer examPaperId;
	private String examCourse;
	private String examEndtime;
	
	public Exams() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Exams(ExamOnline examOnline, ExamType examType, Integer examID, String examTitle, String examDatetime,
			String examSemester, Integer examPaperId, String examCourse, String examEndtime) {
		super();
		this.examOnline = examOnline;
		this.examType = examType;
		this.examID = examID;
		this.examTitle = examTitle;
		this.examDatetime = examDatetime;
		this.examSemester = examSemester;
		this.examPaperId = examPaperId;
		this.examCourse = examCourse;
		this.examEndtime = examEndtime;
	}
	
	@Override
	public String toString() {
		return "Exams [examOnline=" + examOnline + ", examType=" + examType + ", examID=" + examID + ", examTitle="
				+ examTitle + ", examDatetime=" + examDatetime + ", examSemester=" + examSemester + ", examPaperId="
				+ examPaperId + ", examCourse=" + examCourse + ", examEndtime=" + examEndtime + "]";
	}
	
	public String getExamEndtime() {
		return examEndtime;
	}
	public void setExamEndtime(String examEndtime) {
		this.examEndtime = examEndtime;
	}
	
	public ExamOnline getExamOnline() {
		return examOnline;
	}
	public void setExamOnline(ExamOnline examOnline) {
		this.examOnline = examOnline;
	}
	public ExamType getExamType() {
		return examType;
	}
	public void setExamType(ExamType examType) {
		this.examType = examType;
	}
	public Integer getExamID() {
		return examID;
	}
	public void setExamID(Integer examID) {
		this.examID = examID;
	}
	public String getExamTitle() {
		return examTitle;
	}
	public void setExamTitle(String examTitle) {
		this.examTitle = examTitle;
	}
	public String getExamDatetime() {
		return examDatetime;
	}
	public void setExamDatetime(String examDatetime) {
		this.examDatetime = examDatetime;
	}
	public String getExamSemester() {
		return examSemester;
	}
	public void setExamSemester(String examSemester) {
		this.examSemester = examSemester;
	}
	public Integer getExamPaperId() {
		return examPaperId;
	}
	public void setExamPaperId(Integer examPaperId) {
		this.examPaperId = examPaperId;
	}
	public String getExamCourse() {
		return examCourse;
	}
	public void setExamCourse(String examCourse) {
		this.examCourse = examCourse;
	}
	
	
}
