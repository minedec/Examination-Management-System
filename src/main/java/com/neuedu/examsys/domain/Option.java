package com.neuedu.examsys.domain;

public class Option {

	private int optionId;
	private int questionId;
	private String content;
	private String iscorrect;
	private String analysis;
	public int getOptionId() {
		return optionId;
	}
	public void setOptionId(int optionId) {
		this.optionId = optionId;
	}
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
	public String getIscorrect() {
		return iscorrect;
	}
	public void setIscorrect(String iscorrect) {
		this.iscorrect = iscorrect;
	}
	public String getAnalysis() {
		return analysis;
	}
	public void setAnalysis(String analysis) {
		this.analysis = analysis;
	}
	@Override
	public String toString() {
		return "Option [optionId=" + optionId + ", questionId=" + questionId + ", content=" + content + ", iscorrect="
				+ iscorrect + ", analysis=" + analysis + "]";
	}
	public Option(int optionId, int questionId, String content, String iscorrect, String analysis) {
		super();
		this.optionId = optionId;
		this.questionId = questionId;
		this.content = content;
		this.iscorrect = iscorrect;
		this.analysis = analysis;
	}
	public Option() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
