package com.neuedu.examsys.domain;

import java.sql.Date;
import java.sql.Timestamp;

public class Question {

	private int questionId;
	private String content; 
	private QuestionType type;
	private float score;
	private String course;
	private Difficulty difficulty;
	private String major;
	private Timestamp datetime;
	private String author;
	
	public int getQuestionId() {
		return questionId;
	}
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public float getScore() {
		return score;
	}
	public void setScore(float score) {
		this.score = score;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public Timestamp getDatetime() {
		return datetime;
	}
	public void setDatetime(Timestamp datetime) {
		this.datetime = datetime;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	@Override
	public String toString() {
		return "Question [questionId=" + questionId + ", content=" + content + ", score=" + score + ", course=" + course
				+ ", major=" + major + ", datetime=" + datetime + ", author=" + author + "]";
	}
	public Question(int questionId, String content, QuestionType type, float score, String course,
			Difficulty difficulty, String major, Timestamp datetime, String author) {
		super();
		this.questionId = questionId;
		this.content = content;
		this.type = type;
		this.score = score;
		this.course = course;
		this.difficulty = difficulty;
		this.major = major;
		this.datetime = datetime;
		this.author = author;
	}
	public QuestionType getType() {
		return type;
	}
	public void setType(QuestionType type) {
		this.type = type;
	}
	public Difficulty getDifficulty() {
		return difficulty;
	}
	public void setDifficulty(Difficulty difficulty) {
		this.difficulty = difficulty;
	}
	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
