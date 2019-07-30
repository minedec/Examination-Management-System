package com.neuedu.examsys.domain;

/**
 * 表示学生一条回答的记录
 * @author jjd
 * @since 2019/7/29
 *
 */
public class AnsCollection {
	private int id;
	private String studentId;
	private int paperId; //试卷Id
	private int examId; //考试ID
	private int questionId;
	private String option;
	private String content;
	private String isCorrect;
	private int score = -1;
	private String documenteer;
	private String dateTime; //回答时间
	
	
	public AnsCollection() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AnsCollection(int id, String studentId, int paperId, int examId, int questionId, String option, String content,
			String isCorrect, int score, String documenteer, String dateTime) {
		super();
		this.id = id;
		this.examId = examId;
		this.studentId = studentId;
		this.paperId = paperId;
		this.questionId = questionId;
		this.option = option;
		this.content = content;
		this.isCorrect = isCorrect;
		this.score = score;
		this.documenteer = documenteer;
		this.dateTime = dateTime;
	}
	
	public int getExamId() {
		return examId;
	}

	public void setExamId(int examId) {
		this.examId = examId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public int getPaperId() {
		return paperId;
	}
	public void setPaperId(int paperId) {
		this.paperId = paperId;
	}
	public int getQuestionId() {
		return questionId;
	}
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}
	public String getOption() {
		return option;
	}
	public void setOption(String option) {
		this.option = option;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getIsCorrect() {
		return isCorrect;
	}
	public void setIsCorrect(String isCorrect) {
		this.isCorrect = isCorrect;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getDocumenteer() {
		return documenteer;
	}
	public void setDocumenteer(String documenteer) {
		this.documenteer = documenteer;
	}
	public String getDateTime() {
		return dateTime;
	}
	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}

	@Override
	public String toString() {
		return "AnsCollection [id=" + id + ", studentId=" + studentId + ", paperId=" + paperId + ", questionId="
				+ questionId + ", option=" + option + ", content=" + content + ", isCorrect=" + isCorrect + ", score="
				+ score + ", documenteer=" + documenteer + ", dateTime=" + dateTime + "]";
	}
	
	
}
