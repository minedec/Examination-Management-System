package com.neuedu.examsys.domain;

import java.sql.Date;

//试卷类型，用于试卷生成与管理	7.29 15:30	zjy

public class Papers {
	public Papers() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Papers(Integer paperId, String paperName, Date paperDate, String paperAuthor, Integer questionNum,
			float paperScore, String paperCourse, String paperMajor) {
		super();
		this.paperId = paperId;
		this.paperName = paperName;
		this.paperDate = paperDate;
		this.paperAuthor = paperAuthor;
		this.questionNum = questionNum;
		this.paperScore = paperScore;
		this.paperCourse = paperCourse;
		this.paperMajor = paperMajor;
	}
	@Override
	public String toString() {
		return "Papers [paperId=" + paperId + ", paperName=" + paperName + ", paperDate=" + paperDate + ", paperAuthor="
				+ paperAuthor + ", questionNum=" + questionNum + ", paperScore=" + paperScore + ", paperCourse="
				+ paperCourse + ", paperMajor=" + paperMajor + "]";
	}
	public Integer getPaperId() {
		return paperId;
	}
	public void setPaperId(Integer paperId) {
		this.paperId = paperId;
	}
	public String getPaperName() {
		return paperName;
	}
	public void setPaperName(String paperName) {
		this.paperName = paperName;
	}
	public Date getPaperDate() {
		return paperDate;
	}
	public void setPaperDate(Date paperDate) {
		this.paperDate = paperDate;
	}
	public String getPaperAuthor() {
		return paperAuthor;
	}
	public void setPaperAuthor(String paperAuthor) {
		this.paperAuthor = paperAuthor;
	}
	public Integer getQuestionNum() {
		return questionNum;
	}
	public void setQuestionNum(Integer questionNum) {
		this.questionNum = questionNum;
	}
	public float getPaperScore() {
		return paperScore;
	}
	public void setPaperScore(float paperScore) {
		this.paperScore = paperScore;
	}
	public String getPaperCourse() {
		return paperCourse;
	}
	public void setPaperCourse(String paperCourse) {
		this.paperCourse = paperCourse;
	}
	public String getPaperMajor() {
		return paperMajor;
	}
	public void setPaperMajor(String paperMajor) {
		this.paperMajor = paperMajor;
	}
	private Integer paperId;
	private String paperName;
	private Date paperDate;
	private String paperAuthor;
	private Integer questionNum;
	private float paperScore;
	private String paperCourse;
	private String paperMajor;
}
